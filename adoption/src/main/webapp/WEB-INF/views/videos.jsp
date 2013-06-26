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
					<h3>${loadedVideo.title}</h3>
					<iframe width="450" height="280" src="http://www.youtube.com/embed/${loadedVideo.linkText}" frameborder="0" allowfullscreen></iframe>
				</div>
				
				<div class="content">
					<h3>More Videos...</h3>
					<ul style="margin-bottom: 5px;">
						<c:forEach var="video" items="${videos}">
							<li>
								<c:url var="videoUrl" value="/videos?linkText=${video.linkText}"/>
								<a href="${videoUrl}">${video.title}</a>
							</li>
						</c:forEach>
					</ul>
				</div>
				<%@ include file="footer.jspf" %>
			</div>
			
			<%@ include file="navigation.jspf" %>
		</div>
	</body>
</html>