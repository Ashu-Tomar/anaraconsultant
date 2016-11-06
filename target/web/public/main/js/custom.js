$(document).ready(function () {
    var doesFlashExist = $('.makeSomething').find(".displayMessage").length;
    if (doesFlashExist > 0) {
        swal({
            title: "Yayeeeee!",
            text: "hurrey, successfully sent your message.",
            type: "success"
        }, function () {
            window.location.replace("/");
        });

        $('.displayMessage').remove()
    }
});



