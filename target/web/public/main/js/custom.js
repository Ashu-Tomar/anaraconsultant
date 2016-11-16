$(document).ready(function () {
    var doesFlashExist = $('.makeSomething').find(".displayMessage").length;
    if (doesFlashExist > 0) {
        swal({
            title: "Thanks for connecting",
            text: "We will get back to you soon",
            type: "success"
        }, function () {
            if(window.location.pathname.indexOf('/widgets') !== -1){
                window.location.replace("/");
            }
            if(window.location.pathname.indexOf('contactform') !== -1){
                window.location.replace("/contactus");
            }

        });

        $('.displayMessage').remove()
    }
    $(".feature-wrap").hover(function(){
        $(".feature-wrap i").removeClass("feature-wrap-wdt-hover");
        $(".feature-wrap i").addClass("feature-wrap-hover");
    });
    function stripTrailingSlash(str) {
        if(str.substr(-1) == '/') {
            return str.substr(0, str.length - 1);
        }
        return str;
    }


    var url = window.location.pathname;
    var activePage = stripTrailingSlash(url);
    console.log('active link: ' + activePage);
    $('#navbar li a').each(function(){
        var currentPage = stripTrailingSlash($(this).attr('href'));
        // console.log(currentPage);
        if (activePage === currentPage) {
            $('#navbar li a').removeClass('active');
            $(this).addClass('active');
        }

    });
});
