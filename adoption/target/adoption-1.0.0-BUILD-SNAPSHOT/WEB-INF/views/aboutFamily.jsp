<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<link rel="stylesheet" href="<c:url value="resources/css/adoption.css"/>">
		<title>About Family</title>
	</head>
	
	<body>
		<div class="page-wrapper">
			<%@ include file="banner.jspf" %>
			
			<div class="main">
				<div class="content">
					<h3>About ${member.name}</h3>
					<p>
						<img src="resources/image/${member.imgSrc}.jpg" class="ifr"/>
					</p>
					<p><em>- written by ${member.writtenBy}</em></p>
					<c:forEach var="value" items="${descriptions}">
						<p>${value}</p>
					</c:forEach>
					<h4>Why ${member.name} will be an excellent ${member.position}</h4>
					<c:forEach var="value" items="${reasons}">
						<p>${value}</p>
					</c:forEach>
				</div>
				
				<%@ include file="footer.jspf" %>
			</div>
			
			<%@ include file="navigation.jspf" %>
		</div>
	</body>
</html>