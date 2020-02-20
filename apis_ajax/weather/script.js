$(document).ready(function(){
	$('form#info').submit(function() {
		var a=$('#city').val();
		var unit=$('.dg:checked').val();
		if (unit==='default'){unit='';u='K'}
		else if (unit==='imperial'){u='°F'}
		else {u='°C'}

		$.getJSON("https://api.openweathermap.org/data/2.5/weather?q="+$('#city').val()+"&appid=4eb0b682bf2c611d898d072534723ea4&units="+unit,function(data){
			$('p#city_name').text(data.name)
			$('p#current_temp').text(data.main.temp+' '+u)
			

		});
		return false;
	});
});
