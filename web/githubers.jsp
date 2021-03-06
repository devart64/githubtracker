<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<jsp:include page="Header.jsp" />
<header class="header" id="header">
    <!--header-start-->

    <div class="container">
        <figure class="logo animated fadeInDown delay-07s">
            <a href="#"><img src="Assets/img/icon-github.png" Style="margin-top: 50px;" alt=""></a>
        </figure>

        <h1 class="animated fadeInDown delay-07s">Welcome To Github Tracker</h1>
        <ul class="we-create animated fadeInUp delay-1s">
            <li>We are a digital tracker for Githubers.</li>
        </ul>
        <a class="link animated fadeInUp delay-1s servicelink" href="#team">See Githubers Profils</a>
    </div>
</header>
<!--header-end-->

<jsp:include page="Navbar.jsp" />


<section class="main-section team" id="team">
    <!--main-section team-start-->
    <div class="container"><br /><br/>
        <h2>The Githubers</h2>
        <h6>Take a closer look into our amazing members. We won’t bite.</h6>
        <div class="team-leader-block clearfix">
            <c:forEach var="githuber" items="${requestScope.githubers}">
            <div class="team-leader-box">
                <div class="team-leader wow fadeInDown delay-03s">
                    <div class="team-leader-shadow"><a href="#"></a></div>
                    <img class="center-block" src="<c:out value="${githuber.getAvatar_url()}" />" />
                    <ul>
                        <li><a href="#" class="fa-twitter"></a></li>
                        <li><a href="#" class="fa-facebook"></a></li>
                        <li><a href="#" class="fa-pinterest"></a></li>
                        <li><a href="#" class="fa-google-plus"></a></li>
                    </ul>
                </div>

                <h3><c:out value="${githuber.getName()}" /></h3>
                <span><c:out value="${githuber.getEmail()}" /></span>
                <p ><c:out value="${githuber.getBio()}" /></p>
            </div>
            </c:forEach>
        </div><br />
    </div>

</section>
<!--main-section team-end-->

<jsp:include page="Footer.jsp" />

