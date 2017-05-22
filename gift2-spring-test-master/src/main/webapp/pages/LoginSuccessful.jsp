<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Exam Restaurant</title>
<meta name="keywords" content="" />
<meta name="description" content="" />

<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="css/nivo-slider.css" type="text/css"
	media="screen" />

<link rel="stylesheet" type="text/css" href="css/ddsmoothmenu.css" />

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ddsmoothmenu.js">
	
</script>

<script type="text/javascript">
	ddsmoothmenu.init({
		mainmenuid : "top_nav", //menu DIV id
		orientation : 'h', //Horizontal or vertical menu: Set to "h" or "v"
		classname : 'ddsmoothmenu', //class added to menu's outer DIV
		//customtheme: ["#1c5a80", "#18374a"],
		contentsource : "markup" //"markup" or ["container_id", "path_to_menu_file"]
	})
</script>

</head>

<body>

	<div id="templatemo_body_wrapper">
		<div id="templatemo_wrapper">

			<div id="templatemo_header">

				<div id="header_right">
					<p>
						<a href="#">Management Product</a> | <a href="#">Management
							User</a> | <a href="#">...</a> | <a href="#">Checkout</a>
					</p>

				</div>
				<div class="cleaner"></div>
			</div>
			<!-- END of templatemo_header -->

			<div id="templatemo_menubar">

				<br style="clear: left" />
			</div>
			<!-- end of ddsmoothmenu -->
			<div id="templatemo_search">
				<form action="#" method="get">
					<input type="text" value=" " name="keyword" id="keyword"
						title="keyword" onfocus="clearText(this)" onblur="clearText(this)"
						class="txt_field" /> <input type="submit" name="Search" value=" "
						alt="Search" id="searchbutton" title="Search" class="sub_btn" />
				</form>
			</div>
		</div>
		<!-- END of templatemo_menubar -->

		<div id="templatemo_main">
			<div id="sidebar" class="float_l"></div>
			<div id="content" class="float_r">
				<div id="slider-wrapper">
					<div id="slider" class="nivoSlider">
						<img src="images/slider/02.jpg" alt="" /> <a href="#"><img
							src="images/slider/01.jpg" alt=""
							title="This is an example of a caption" /></a> <img
							src="images/slider/03.jpg" alt="" /> <img
							src="images/slider/04.jpg" alt="" title="#htmlcaption" />
					</div>
					<div id="htmlcaption" class="nivo-html-caption">
						<strong>This</strong> is an example of a <em>HTML</em> caption
						with <a href="#">a link</a>.
					</div>
				</div>
				<script type="text/javascript" src="js/jquery-1.4.3.min.js"></script>
				<script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
				<script type="text/javascript">
					$(window).load(function() {
						$('#slider').nivoSlider();
					});
				</script>

				<div class="cleaner"></div>
			</div>
			<!-- END of templatemo_main -->

			<div id="templatemo_footer">
				<p>
					<a href="#">Home</a> | <a href="#">Products</a> | <a href="#">About</a>
					| <a href="#">FAQs</a> | <a href="#">Checkout</a> | <a href="#">Contact
						Us</a>
				</p>

				Copyright © 2072 <a href="#">Your Company Name</a>
				<!-- Credit: www.templatemo.com -->
			</div>
			<!-- END of templatemo_footer -->

		</div>
		<!-- END of templatemo_wrapper -->
	</div>
	<!-- END of templatemo_body_wrapper -->

</body>
</html>