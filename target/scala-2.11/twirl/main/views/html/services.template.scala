
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object services_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class services extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Welcome to Play")/*2.36*/ {_display_(Seq[Any](format.raw/*2.38*/("""

    """),format.raw/*4.5*/("""<div class="col-sm-12">
    <ul class="circle-stats">
    <li class="circle-stat-small">
    <div class="circle-stat-wrapper">
    <div>
    <canvas id="myCanvas" width="230" height="230"></canvas>
    </div>
    <p class="percent">1</p>
    </div>
    <h3 class="title">Planning</h3>
    <p class="description">Duis vitae velit blandit, euismod lectus et, semper justo. Nulla egestas.</p>
    </li>
    <li class="circle-stat-small">
    <div class="circle-stat-wrapper">
    <div>
     <canvas width="200" height="200"></canvas>
    </div>
    <p class="percent">2</p>
    </div>
    <h3 class="title">Developing</h3>
    <p class="description">Phasellus et scelerisque justo, et ultrices sem imperdiet eu. Maecenas lacinia leo.</p>
    </li>
    <li class="circle-stat-small">
    <div class="circle-stat-wrapper">
    <div>
    """),format.raw/*29.51*/("""
    """),format.raw/*30.5*/("""</div>
    <p class="percent">3</p>
    </div>
    <h3 class="title">Testing</h3>
    <p class="description">Nulla non interdum sem. Vestibulum is varius fermentum auctor praesent.</p>
    </li>
    <li class="circle-stat-small">
    <div class="circle-stat-wrapper">
    <div>
    """),format.raw/*39.51*/("""
    """),format.raw/*40.5*/("""</div>
    <p class="percent">4</p>
    </div>
    <h3 class="title">Delivering</h3>
    <p class="description">Nunc et dictum dui, ac sodales sapien. Ut tincidunt gravida nisi, sit amet interdum.</p>
    </li>
    </ul>
    </div>

""")))}),format.raw/*49.2*/("""
"""),format.raw/*50.1*/("""<script>
       var canvas = document.getElementById("myCanvas");
        /*var cvs = document.getElementsByTagName("canvas");*/
         var context = canvas.getContext('2d');
         var imageObj = new Image();

         imageObj.onload = function() """),format.raw/*56.39*/("""{"""),format.raw/*56.40*/("""
         """),format.raw/*57.10*/("""context.drawImage(imageObj, 30, 60);
         """),format.raw/*58.10*/("""}"""),format.raw/*58.11*/(""";
         imageObj.src = """"),_display_(/*59.27*/routes/*59.33*/.Assets.versioned("images/services/procedure/img1.png")),format.raw/*59.88*/("""";


        $(document).ready(function()"""),format.raw/*62.37*/("""{"""),format.raw/*62.38*/("""

            """),format.raw/*64.13*/("""$('#change').click(function()"""),format.raw/*64.42*/("""{"""),format.raw/*64.43*/("""
                """),format.raw/*65.17*/("""var a = $('#takeinput').val();
                console.log("a:== " +a);
                $('p').text(a);
            """),format.raw/*68.13*/("""}"""),format.raw/*68.14*/(""");
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/(""");
       /* var ctx = demo.getContext('2d'),
                txt = '1';
        var imageObj = new Image();

        /!*imageObj.onload = function() """),format.raw/*74.41*/("""{"""),format.raw/*74.42*/("""
            """),format.raw/*75.13*/("""context.drawImage(imageObj, 30, 60);
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/(""";*!/

        drawTextBG(ctx, txt, '32px arial', 30, 30);

        /// expand with color, background etc.
        function drawTextBG(ctx, txt, font, x, y) """),format.raw/*81.51*/("""{"""),format.raw/*81.52*/("""

            """),format.raw/*83.13*/("""ctx.save();
            ctx.font = font;
            ctx.textBaseline = 'top';
            ctx.drawImage(imageObj, 30, 60);

            var width = ctx.measureText(txt).width;
            ctx.fillRect(x, y, width, parseInt(font, 10));

            ctx.fillStyle = '#000';
            ctx.fillText(txt, x, y);

            ctx.restore();
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/("""*/
</script>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object services extends services_Scope0.services
              /*
                  -- GENERATED --
                  DATE: Thu Oct 27 15:23:22 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/services.scala.html
                  HASH: e9d90c07bb232b299522969269437e72ad8a8806
                  MATRIX: 533->1|645->18|672->20|684->25|721->54|760->56|792->62|1652->940|1684->945|1994->1273|2026->1278|2290->1512|2318->1513|2599->1766|2628->1767|2666->1777|2740->1823|2769->1824|2824->1852|2839->1858|2915->1913|2984->1954|3013->1955|3055->1969|3112->1998|3141->1999|3186->2016|3330->2132|3359->2133|3397->2144|3426->2145|3604->2295|3633->2296|3674->2309|3746->2354|3775->2355|3959->2511|3988->2512|4030->2526|4403->2872|4432->2873
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|28->4|53->29|54->30|63->39|64->40|73->49|74->50|80->56|80->56|81->57|82->58|82->58|83->59|83->59|83->59|86->62|86->62|88->64|88->64|88->64|89->65|92->68|92->68|93->69|93->69|98->74|98->74|99->75|100->76|100->76|105->81|105->81|107->83|119->95|119->95
                  -- GENERATED --
              */
          