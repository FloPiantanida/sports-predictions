var AuthInterceptor = function ($q, $location) {
	return { 'responseError' : function(rejection){
		// TODO : Impl�menter parametre ?returnUrl
		if(rejection.status === 401)
			$location.url('login');
		}
	};
}
AuthInterceptor.$inject = ['$q', '$location'];