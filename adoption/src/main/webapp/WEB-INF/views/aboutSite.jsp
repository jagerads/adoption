<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<link rel="stylesheet" href="<c:url value="/resources/css/adoption.css"/>">
		<title>About Us</title>
	</head>
	
	<body>
		<div class="page-wrapper">
			<%@ include file="banner.jspf" %>
			
			<div class="main">
				<div class="content">
					<p>This website was designed by Jordan and Kaylah Gerads and written by Jordan Gerads.</p>
					<p>
						The following browsers have been tested for compatibility:
					</p>
					<ul>
						<li>Google Chrome version 27.0</li>
						<li>Internet Explorer version 10.0</li>
						<li>Mozilla Firefox version 21.0</li>
					</ul>
					<p>
						The site is best viewed in Google Chrome.
					</p>
				</div>
				
				<%@ include file="footer.jspf" %>
			</div>
			
			<%@ include file="navigation.jspf" %>
		</div>
	</body>
</html>