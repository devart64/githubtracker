<%--
  Created by IntelliJ IDEA.
  User: steph
  Date: 18/04/2018
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<footer class="footer">
    <div class="container">
        <div class="footer-logo"><a href="#"><img src="Assets/img/icon-github.png" alt=""></a></div>
        <span class="copyright">&copy; <span style="color: #FBA858;">WCS</span> Theme. All Rights Reserved ( risk of death !)</span>
        <div class="credits">
            <!--
      All the links in the footer should remain intact.
      You can delete the links only if you purchased the pro version.
      Licensing information: https://bootstrapmade.com/license/
      Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Knight
    -->
            <a style="color: #FBA858;" href="https://wildcodeschool.fr/biarritz/">Wild Code School Templates</a> by <a style="color: #FBA858;" href="https://wildcodeschool.fr/biarritz/">WCS Biarritz</a>
        </div>
    </div>
</footer>


<script type="text/javascript">
    $(document).ready(function(e) {
        $('#test').scrollToFixed();
        $('.res-nav_click').click(function() {
            $('.main-nav').slideToggle();
            return false

        });

    });
</script>

<script>
    wow = new WOW({
        animateClass: 'animated',
        offset: 100
    });
    wow.init();
</script>


<script type="text/javascript">
    $(window).load(function() {

        $('.main-nav li a, .servicelink').bind('click', function(event) {
            var $anchor = $(this);

            $('html, body').stop().animate({
                scrollTop: $($anchor.attr('href')).offset().top - 102
            }, 1500, 'easeInOutExpo');
            /*
            if you don't want to use the easing effects:
            $('html, body').stop().animate({
                scrollTop: $($anchor.attr('href')).offset().top
            }, 1000);
            */
            if ($(window).width() < 768) {
                $('.main-nav').hide();
            }
            event.preventDefault();
        });
    })
</script>

<script type="text/javascript">
    $(window).load(function() {


        var $container = $('.portfolioContainer'),
            $body = $('body'),
            colW = 375,
            columns = null;


        $container.isotope({
            // disable window resizing
            resizable: true,
            masonry: {
                columnWidth: colW
            }
        });

        $(window).smartresize(function() {
            // check if columns has changed
            var currentColumns = Math.floor(($body.width() - 30) / colW);
            if (currentColumns !== columns) {
                // set new column count
                columns = currentColumns;
                // apply width to container manually, then trigger relayout
                $container.width(columns * colW)
                    .isotope('reLayout');
            }

        }).smartresize(); // trigger resize to set container width
        $('.portfolioFilter a').click(function() {
            $('.portfolioFilter .current').removeClass('current');
            $(this).addClass('current');

            var selector = $(this).attr('data-filter');
            $container.isotope({

                filter: selector,
            });
            return false;
        });

    });
</script>

</body>

</html>
