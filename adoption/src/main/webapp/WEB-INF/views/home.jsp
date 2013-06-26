<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
	<head>
		<link rel="stylesheet" href="<c:url value="/resources/css/adoption.css"/>">
		<title>Home</title>
	</head>
	<body>
		<div class="page-wrapper">
			<section class="intro">
				<%@ include file="banner.jspf" %>
				
				<div class="summary">
					<img src="<c:url value="/resources/image/pacifier.png"/>" class="ifr" style="margin-top: -10px;"/>
					<p>Welcome to our website! We are so happy to share our story with you as we embark on our journey to create a family of our own.</p>
					<p>Please feel free to look around our website and learn a little bit about us.</p>
				</div>
			</section>
			
			<div class="main">
				<div class="content">
					<h3>Some Title Here</h3>
					<p>Maybe just a little bit of info could be present here.</p>
					<p>Another little cute follow-up paragraph here.</p>
					<p>Wrap it up nicely!</p>
				</div>
				
				<%@ include file="footer.jspf" %>
			</div>
			
			<%@ include file="navigation.jspf" %>
		</div>
	</body>
</html>
