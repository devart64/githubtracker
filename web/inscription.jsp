<%--
  Created by IntelliJ IDEA.
  User: steph
  Date: 18/04/2018
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="Header.jsp" />
<jsp:include page="Navbar.jsp" />
<div class="container">
    <section class="main-section contact" id="contact">

        <div class="row">
            <div class="well" style="margin-top: -50px; background-color: #FBA858;">
                <h1 class="text-center" style="color: white;">Become a GitHubers !</h1>
            </div><br/>
            <div class="col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 wow fadeInUp delay-05s">
                <div class="form">

                    <div id="sendmessage">Vous êtes bien inscrits</div>
                    <div id="errormessage"></div>
                    <form action="GithubersServlet" method="post" role="form" class="contactForm">
                        <div class="form-group">
                            <input type="text" name="name" class="form-control input-text" id="name" placeholder="Votre Nom" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                            <div class="validation"></div>
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-control input-text" name="email" id="email" placeholder="Votre Email" data-rule="email" data-msg="Please enter a valid email" />
                            <div class="validation"></div>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control input-text" name="subject" id="subject" placeholder="Votre pseudo" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                            <div class="validation"></div>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control input-text" name="subject" id="subject" placeholder="Url de votre photo" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                            <div class="validation"></div>
                        </div>
                        <div class="form-group">
                            <textarea class="form-control input-text text-area" name="message" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Ta petite description"></textarea>
                            <div class="validation"></div>
                        </div>
<br />
                        <div class="text-center"><button type="submit" class="input-btn">Valide ton inscription</button></div>
                    </form>
                </div>
            </div>
        </div>
    </section>
</div>
<jsp:include page="Footer.jsp" />
