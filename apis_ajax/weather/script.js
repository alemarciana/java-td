$(document).ready(function(){
	$('form#info').submit(function() {
		var a=$('#city').val()
		var v=$('.dg:checked').val()
		if (v==='default'){v=''};
		$.getJSON("https://api.openweathermap.org/data/2.5/weather?q="+$('#city').val()+"&appid=4eb0b682bf2c611d898d072534723ea4&units="+v,function(data){
			$('p#city_name').text(data.name)
			$('p#current_temp').text(data.main.temp+' '+v)
			

		});
		return false;
	});
});
