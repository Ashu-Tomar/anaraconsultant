$(document).ready(function () {
    var doesFlashExist = $('.makeSomething').find(".displayMessage").length;
    if (doesFlashExist > 0) {
        swal({
            title: "Thanks for connecting",
            text: "Your message has been successfully sent ",
            type: "success"
        }, function () {
            window.location.replace("/");
        });

        $('.displayMessage').remove()
    }
    $(".feature-wrap").hover(function(){
        $(".feature-wrap i").removeClass("feature-wrap-wdt-hover");
        $(".feature-wrap i").addClass("feature-wrap-hover");
    });
});
