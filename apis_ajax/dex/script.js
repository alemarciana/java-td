$.fn.extend({
	toggleImage: function(a, b){
		return $(this).attr({"src":$(this).attr("src") == b ? a : b,"src-alt":$(this).attr("src-alt") == b ? a : b});
	}
});
function drawPoke(){
	for (i=1;i<=151;i++){
		$('#sprites').append("<figure class='column image is-2'><img id='"+i+"' class='is-rounded' src='https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+i+".png'></figure>");
	}
}
function getbg(type){
	switch (type){
		case "normal":
			return "#A8A878";
			break;
		case "grass":
			return "#78C850";
			break;
		case "fire":
			return "#F08030";
			break;
		case "water":
			return "#6890F0";
			break;
		case "poison":
			return "#A040A0";
			break;
		case "bug":
			return "#A8B820";
			break;
		case "electric":
			return "#F8D030";
			break;
		case "ground":
			return "#E0C068";
			break;
		case "fairy":
			return "#EE99AC";
			break;
		case "fighting":
			return "#C03028";
			break;
		case "psychic":
			return "#F85888";
			break;
		case "rock":
			return "#B8A038";
			break;
		case "ghost":
			return "#705898";
			break;
		case "ice":
			return "#98D8D8";
			break;
		case "dragon":
			return "#7038F8";
			break;
		default:
			return "white";
	}
}
$(document).ready(function(){
	$('#sprites img').hover(function(){
		if ($(this).css("background-color")==="rgba(0, 0, 0, 0)"){$(this).css("background-color","#d8d8d8");}
		},function(){if ($(this).css("background-color")==="rgb(216, 216, 216)"){$(this).css("background-color","")};
	});
	$('#sprites img').click(function(){
		$("img.bg").css("background-color","");
		$("img.bg").removeClass("bg");
		t=this;
		$.getJSON("https://pokeapi.co/api/v2/pokemon/"+$(this).attr("id"),function(data){
			var color = getbg(data.types[data.types.length-1].type.name);
			$(t).addClass("bg")
			$("#welcome").hide();
			$("#info").css("background-color",color);
			$(t).css("background-color",color);
			$("ul#types").html("");
			$("b").css("display","block");
			$("#name").text(data.name);
			$("#info img").attr({"src":data.sprites.front_default,"src-alt":data.sprites.back_default});
			for (i=data.types.length-1;i>=0;i--){
				$("ul#types").append("<li>"+data.types[i].type.name+"</li>");
			}
			$("p#height").html("<span style='font-weight:bolder;'>Height: </span>"+data.height);
			$("p#weight").html("<span style='font-weight:bolder;'>Weight: </span>"+data.weight);
			var audio = new Audio('img/'+data.name+'.m4a');
			audio.play()
		});
	});
	$("#info img").hover(function(){
			$(this).toggleImage($(this).attr("src"),$(this).attr("src-alt"));
		},function(){$(this).toggleImage($(this).attr("src"),$(this).attr("src-alt"));
	});

});
