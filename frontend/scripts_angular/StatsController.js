angular.module('sports-predictions')
.controller('StatsController', ['$scope', function($scope){
	Highcharts.chart('containerRank', {
		chart: {
			type: 'line',
			inverted: false
		},
		title: {
            text: 'Historique de votre classement',
            x: -20
        },
		xAxis: {
			categories: ['Match 1', 'Match 2', 'Match 3', 'Match 4', 'Match 5', 'Match 6', 
				'Match 7', 'Match 8', 'Match 9', 'Match 10', 'Match 11', 'Match 12']
		},
		exporting:{
			enabled: false
		},	
		credits: {
			enabled: false
		},
		series: [{
			name: 'Classement',
		type: 'line',
		data: [5,5,2,81,88,1,8,1,8,1,8,9],
		color: '#FF0000'
		}]
	});
}]);