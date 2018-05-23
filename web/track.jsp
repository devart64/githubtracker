<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="Header.jsp" />
<jsp:include page="Navbar.jsp" />
<div class="container">
    <section class="main-section contact" id="contact">

        <div class="row">
            <div class="well" style="margin-top: -50px; background-color: #FBA858;">
                <h1 class="text-center" style="color: white;">Track a GitHuber !</h1>
            </div><br/>
            <div class="col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 wow fadeInUp delay-05s">
                <div class="form">


                    <form action="track" method="post">
                        <div class="form-group">
                            <input type="text" name="name" class="form-control input-text" id="name" placeholder="Votre Nom" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                            <div class="validation"></div>
                        </div>
                        <br />
                        <div class="text-center"><button type="submit" class="input-btn">Trackkkkk</button></div>
                    </form>
                </div>
            </div>
        </div>
    </section>
</div>
<jsp:include page="Footer.jsp" />
