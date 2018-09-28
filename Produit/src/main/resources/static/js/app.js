var app=angular.module("myApp",['ui.router']);

app.config(function($stateProvider,$urlRouterProvider){
	$stateProvider.state('home',{
		url:'/home',
		templateUrl:'view/home.html',
		controller:'homeController'
	});
	$stateProvider.state('newProduit',{
		url:'/newProduit',
		templateUrl:'view/newProduit.html',
		controller:'newProduitController'
	});
	$stateProvider.state('chercher',{
		url:'/chercher',
		templateUrl:'view/chercher.html',
		controller:'myController'
	});
});

app.controller('homeController', function(){
	
});
app.controller('newProduitController', function($scope,$http){
	
	$scope.produit={}
	$scope.mod=0;  //to hide a panel or whatever bf loading data
	
	$scope.saveProduit=function(){
		$http.post("http://localhost:8080/produits",$scope.produit)
	    .success(function(data){
	    	$scope.produit=data;	
	    	$scope.mod=1; //Show a panel or whatever after loading data
	    })
	    .error(function(){
	    	console.log(err);
	    });		
	}
	
	$scope.modeForm=function(){
		$scope.produit={};
		$scope.mod=0;
	}

});



app.controller("myController", function($scope, $http){
	
	$scope.pageProduits=null;
	$scope.motcle="";
	$scope.size=3;
	$scope.pageCourant=0;
	$scope.pages=[];
		
	
	$scope.chercherProduits=function(){	
		$http.get("http://localhost:8080/chercherproduits?mc="
		+$scope.motcle+"&page="+$scope.pageCourant+"&size ="+$scope.size)
		.success(function(data){
			$scope.pageProduits=data;
			$scope.pages=new Array(data.totalPages);
		})
		.error(function(err){
			console.log(err);
		});
	}
	
	$scope.goToPage=function(m){
		$scope.pageCourant=m;
		$scope.chercherProduits();
	}
	
	$scope.delfunction=function(idProduit){
		
		$http({
			method : 'DELETE',
			url    : 'http://localhost:8080/produits/'+idProduit,
			data   : null,
			headers: {'Content-Type':'application/json'}
		})	
		.success(function(data){
			$scope.produit=data;
			
			
		})
		.error(function(data){
			$scope.messageError=data.message;
		});
			
	}
	
	$scope.loadFieldsIntoChamps=function(produit){
		$scope.mod=0;
		$scope.produit=produit;
		$scope.mod=1;
	}
	$scope.editProduit=function(idProduit){
		
		$scope.mod=0;
		$http({
			method : 'PUT',
			url    : 'http://localhost:8080/produits/'+idProduit,
			data   : $scope.produit,
			headers: {'Content-Type':'application/json'}
		})
			.success(function(data){
			$scope.produit=data;
			$scope.mod=0;
			alert('Mis à jour réussi !')
		})
		.error(function(){
			
		})
		$scope.mode=0;
	}
});