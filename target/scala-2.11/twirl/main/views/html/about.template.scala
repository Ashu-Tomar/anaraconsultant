
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Welcome to Play")/*2.36*/ {_display_(Seq[Any](format.raw/*2.38*/("""
    """),format.raw/*3.5*/("""<div class="about-banner">
        <img src=""""),_display_(/*4.20*/routes/*4.26*/.Assets.versioned("images/about/about_us.png")),format.raw/*4.72*/("""">
    </div>
    <div class="container content">
        <div class="title-box-v2">
            <h2>About <span class="color-green">ANARA CONSULTANT</span></h2>
        </div>

        <div class="row">
            <div class="col-md-8">
                <div class="row">
                    <div class="col-sm-12">
                        <p class="text-center">ANARA CONSULTANT were established and are managed by
                            professionals having extensive experience
                            in HRD, IT Industry Marketing, Financial Management,
                            Constructions Industries etc. with the entire necessary infrastructure.</p>
                        <p class="text-center">ANARA Consultant is one among and leading recruitment
                            Agency in India & Gulf, providing Professional recruitment
                            Consultancy services. ANARA CONSULTANT is already recognized
                            as highly successful in providing its clients, reliable,
                            qualified and cost effective solutions to their manpower
                            need either from our comprehensive database or through
                            creative advertisements & walk in interview selection.</p>
                    </div>
                </div>
            </div><!--/col-md-8-->

            <div class="col-md-4">
                <h3 class="heading-xs no-top-space">Hospitality Industry<span class="pull-right">88%</span></h3>
                <div class="progress progress-u progress-xs">
                    <div style="width: 88%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="88" role="progressbar" class="progress-bar progress-bar-u">
                    </div>
                </div>

                <h3 class="heading-xs no-top-space">Medical <span class="pull-right">76%</span></h3>
                <div class="progress progress-u progress-xs">
                    <div style="width: 76%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="76" role="progressbar" class="progress-bar progress-bar-u">
                    </div>
                </div>

                <h3 class="heading-xs no-top-space">Construction <span class="pull-right">97%</span></h3>
                <div class="progress progress-u progress-xs">
                    <div style="width: 97%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="97" role="progressbar" class="progress-bar progress-bar-u">
                    </div>
                </div>

                <h3 class="heading-xs no-top-space">Oil & Gas Field <span class="pull-right">68%</span></h3>
                <div class="progress progress-u progress-xs">
                    <div style="width: 68%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="68" role="progressbar" class="progress-bar progress-bar-u">
                    </div>
                </div>
            </div><!--/col-md-4-->
        </div>
    </div>
    <div class="parallax-bg">
        <div class="container content parallax-about">
            <div class="title-box-v2">
                <h2 style="color:#79e6c5">Why Choose us</h2>
                <p>At ANARA CONSULTANT we want to understand your goals,
                    your needs and how the inevitable changes of this business are affecting your world.
                    With such an understanding we then match the right talent to deliver successful results.</p>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <div class="banner-info light margin-bottom-10">
                        <i class="rounded-x fa fa-bell"></i>
                        <div class="overflow-h">
                            <h3>Our mission</h3>
                            <p>We foster a culture of trust and continuous learning while meeting expectations of clients, candidates, contractors and our employees</p>
                        </div>
                    </div>
                    <div class="banner-info light margin-bottom-10">
                        <i class="rounded-x fa fa-flag"></i>
                        <div class="overflow-h">
                            <h3>Our vision</h3>
                            <p>The pursuit of quality manpower and utmost customer satisfaction
                                is a legacy that we treasure the most. It is a tradition that
                                we strive to nurture and maintain</p>
                        </div>
                    </div>
                    <div class="banner-info light margin-bottom-10">
                        <i class="rounded-x fa fa-bookmark"></i>
                        <div class="overflow-h">
                            <h3>We are good at ...</h3>
                            <p>Our mission statement is to ensure that we provide
                                the right resources at the right time to maximize our clients
                                business potential. We deliver, no matter what</p>
                        </div>
                    </div>
                    <div class="margin-bottom-20"></div>
                </div>
                <div class="col-md-6">
                    <img class="img-responsive" src=""""),_display_(/*96.55*/routes/*96.61*/.Assets.versioned("images/about/visonsm.png")),format.raw/*96.106*/("""" alt="">
                </div>
            </div>
        </div><!--/container-->
    </div>
    <div class="container content">
        <div class="title-box-v2">
            <h2>Our <span class="color-green">Team Management</span></h2>
        </div>

        <div class="row">
            <div class="col-sm-12">
                <p class="text-center">A team of dedicated employees is the
                    force behind our immense success in this industry.
                    Our team is not just a bunch of people who are monotonously
                    doing their assigned tasks. Our team is dynamic, prolific, passionate and judicious.
                    All these qualities boost our processes and help inidentifying,
                    scrutinizing and selecting the right aspirants for the right jobs.</p>
            </div>
        </div>
    </div>
    <div class="parallax-team parallaxBg" style="background-position: 50% 117px ;">
        <div class="container content">
            """),format.raw/*126.21*/("""

            """),format.raw/*128.13*/("""<div class="row">
                    <!-- Team v2 -->
                <div class="col-md-3 col-sm-6">
                    <div class="box-flip box-color box-icon box-icon-center box-icon-round box-icon-large text-center flip" style="min-height: 436px ;">
                        <div class="front">
                            <div class="box1 box-default" style="min-height: 436px ;">
                                <span class="box-icon-title">
                                    <img class="img-responsive" src=""""),_display_(/*135.71*/routes/*135.77*/.Assets.versioned("images/about/team/rahul.jpg")),format.raw/*135.125*/("""" alt="">
                                    <h2>Rahul Chaudhary</h2>
                                    <p>Overseas Manager</p>
                                </span>
                            </div>
                        </div>

                        <div class="back">
                            <div class="box2 box-default" style="min-height: 436px ;">
                                <h4 class="nomargin">Rahul Chaudhary</h4>
                                """),format.raw/*145.62*/("""
                                """),format.raw/*146.33*/("""<hr>
                                <p>Enthusiastic & Passionate about recruitment, Result Oriented, Perseverant</p>
                                <p>Experience in sourcing using: internet channels, through Agents, employee referrals,
                                   job boards, cold calling, and other innovative search techniques.</p>
                                """),format.raw/*152.120*/("""
                                """),format.raw/*153.174*/("""
                                """),format.raw/*154.33*/("""<hr>
                                <ul class="list-inline team-social">
                                    <li>
                                        <a data-placement="top" data-toggle="tooltip" class="fb tooltips" data-original-title="Facebook" href="#">
                                            <i class="fa fa-facebook"></i></a>
                                    </li>
                                    <li>
                                        <a data-placement="top" data-toggle="tooltip" class="tw tooltips" data-original-title="Twitter" href="#">
                                            <i class="fa fa-twitter"></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-placement="top" data-toggle="tooltip" class="gp tooltips" data-original-title="Google plus" href="#">
                                            <i class="fa fa-google-plus"></i>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                    <!-- End Team v2 -->
                        <!-- Team v2 -->
                    <div class="col-md-3 col-sm-6">
                        <div class="box-flip box-color box-icon box-icon-center box-icon-round box-icon-large text-center flip" style="min-height: 436px ;">
                            <div class="front">
                                <div class="box1 box-default" style="min-height: 436px ;">
                                    <span class="box-icon-title">
                                        <img class="img-responsive" src=""""),_display_(/*182.75*/routes/*182.81*/.Assets.versioned("images/about/team/nitin.jpg")),format.raw/*182.129*/("""" alt="">
                                        <h2>Nitin Tyagi</h2>
                                        <p>Overseas Manager</p>
                                    </span>
                                </div>
                            </div>

                            <div class="back">
                                <div class="box2 box-default" style="min-height: 436px ;">
                                    <h4 class="nomargin">Nitin Tyagi</h4>
                                    """),format.raw/*192.66*/("""
                                    """),format.raw/*193.37*/("""<hr>
                                     <p>Contact me on following</p>
                                    """),format.raw/*197.120*/("""
                                    """),format.raw/*198.178*/("""
                                    """),format.raw/*199.37*/("""<hr>
                                    <ul class="list-inline team-social">
                                        <li>
                                            <a data-placement="top" data-toggle="tooltip" class="fb tooltips" data-original-title="Facebook" href="#">
                                                <i class="fa fa-facebook"></i></a>
                                        </li>
                                        <li>
                                            <a data-placement="top" data-toggle="tooltip" class="tw tooltips" data-original-title="Twitter" href="#">
                                                <i class="fa fa-twitter"></i>
                                            </a>
                                        </li>
                                        <li>
                                            <a data-placement="top" data-toggle="tooltip" class="gp tooltips" data-original-title="Google plus" href="#">
                                                <i class="fa fa-google-plus"></i>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- End Team v2 -->
                            <!-- Team v2 -->
                        <div class="col-md-3 col-sm-6">
                            <div class="box-flip box-color box-icon box-icon-center box-icon-round box-icon-large text-center flip" style="min-height: 436px ;">
                                <div class="front">
                                    <div class="box1 box-default" style="min-height: 436px ;">
                                        <span class="box-icon-title">
                                            <img class="img-responsive" src=""""),_display_(/*227.79*/routes/*227.85*/.Assets.versioned("images/about/team/chetan.jpg")),format.raw/*227.134*/("""" alt="">
                                            <h2>Chetan Sharma</h2>
                                            <p>HR Manager</p>
                                        </span>
                                    </div>
                                </div>

                                <div class="back">
                                    <div class="box2 box-default" style="min-height: 436px ;">
                                        <h4 class="nomargin">Chetan Sharma</h4>
                                        """),format.raw/*237.70*/("""
                                        """),format.raw/*238.41*/("""<hr>
                                         <p>Contact me on following</p>
                                        """),format.raw/*242.124*/("""
                                        """),format.raw/*243.182*/("""
                                        """),format.raw/*244.41*/("""<hr>
                                        <ul class="list-inline team-social">
                                            <li>
                                                <a data-placement="top" data-toggle="tooltip" class="fb tooltips" data-original-title="Facebook" href="#">
                                                    <i class="fa fa-facebook"></i></a>
                                            </li>
                                            <li>
                                                <a data-placement="top" data-toggle="tooltip" class="tw tooltips" data-original-title="Twitter" href="#">
                                                    <i class="fa fa-twitter"></i>
                                                </a>
                                            </li>
                                            <li>
                                                <a data-placement="top" data-toggle="tooltip" class="gp tooltips" data-original-title="Google plus" href="#">
                                                    <i class="fa fa-google-plus"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    <!-- End Team v2 -->

                    <!-- Team v2 -->
                            <div class="col-md-3 col-sm-6">
                                <div class="box-flip box-color box-icon box-icon-center box-icon-round box-icon-large text-center flip" style="min-height: 436px ;">
                                    <div class="front">
                                        <div class="box1 box-default" style="min-height: 436px ;">
                                            <span class="box-icon-title">
                                                <img class="img-responsive" src=""""),_display_(/*273.83*/routes/*273.89*/.Assets.versioned("images/about/team/avinash.jpg")),format.raw/*273.139*/("""" alt="">
                                                <h2>Avinash</h2>
                                                <p>HR Assistant</p>
                                            </span>
                                        </div>
                                    </div>

                                    <div class="back">
                                        <div class="box2 box-default" style="min-height: 436px ;">
                                            <h4 class="nomargin">Avinash</h4>
                                            """),format.raw/*283.74*/("""
                                            """),format.raw/*284.45*/("""<hr>
                                            <p>Contact me on following</p>

                                            """),format.raw/*289.128*/("""
                                            """),format.raw/*290.186*/("""
                                            """),format.raw/*291.45*/("""<hr>
                                            <ul class="list-inline team-social">
                                                <li>
                                                    <a data-placement="top" data-toggle="tooltip" class="fb tooltips" data-original-title="Facebook" href="#">
                                                        <i class="fa fa-facebook"></i></a>
                                                </li>
                                                <li>
                                                    <a data-placement="top" data-toggle="tooltip" class="tw tooltips" data-original-title="Twitter" href="#">
                                                        <i class="fa fa-twitter"></i>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a data-placement="top" data-toggle="tooltip" class="gp tooltips" data-original-title="Google plus" href="#">
                                                        <i class="fa fa-google-plus"></i>
                                                    </a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                    <!-- End Team v2 -->
                <div class="col-md-3 col-sm-6">
                    <div class="box-flip box-color box-icon box-icon-center box-icon-round box-icon-large text-center flip" style="min-height: 436px ;">
                        <div class="front">
                            <div class="box1 box-default" style="min-height: 436px ;">
                                <span class="box-icon-title">
                                    <img class="img-responsive" src=""""),_display_(/*318.71*/routes/*318.77*/.Assets.versioned("images/about/team/avinash.jpg")),format.raw/*318.127*/("""" alt="">
                                    <h2>Manoj</h2>
                                    <p>Accountant</p>
                                </span>
                            </div>
                        </div>

                        <div class="back">
                            <div class="box2 box-default" style="min-height: 436px ;">
                                <h4 class="nomargin">Manoj</h4>
                                """),format.raw/*328.62*/("""
                                """),format.raw/*329.33*/("""<hr>
                                <p>Contact me on following</p>

                                """),format.raw/*334.116*/("""
                                """),format.raw/*335.174*/("""
                                """),format.raw/*336.33*/("""<hr>
                                <ul class="list-inline team-social">
                                    <li>
                                        <a data-placement="top" data-toggle="tooltip" class="fb tooltips" data-original-title="Facebook" href="#">
                                            <i class="fa fa-facebook"></i></a>
                                    </li>
                                    <li>
                                        <a data-placement="top" data-toggle="tooltip" class="tw tooltips" data-original-title="Twitter" href="#">
                                            <i class="fa fa-twitter"></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-placement="top" data-toggle="tooltip" class="gp tooltips" data-original-title="Google plus" href="#">
                                            <i class="fa fa-google-plus"></i>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <!--end team2-->
                <div class="col-md-3 col-sm-6">
                    <div class="box-flip box-color box-icon box-icon-center box-icon-round box-icon-large text-center flip" style="min-height: 436px ;">
                        <div class="front">
                            <div class="box1 box-default" style="min-height: 436px ;">
                                <span class="box-icon-title">
                                    <img class="img-responsive" src=""""),_display_(/*363.71*/routes/*363.77*/.Assets.versioned("images/about/team/ateeb.jpg")),format.raw/*363.125*/("""" alt="">
                                    <h2>Ateeb</h2>
                                    <p>Oversaes Manager</p>
                                </span>
                            </div>
                        </div>

                        <div class="back">
                            <div class="box2 box-default" style="min-height: 436px ;">
                                <h4 class="nomargin">Ateeb</h4>
                                """),format.raw/*373.62*/("""
                                """),format.raw/*374.33*/("""<hr>
                                <p>Contact me on following</p>

                                """),format.raw/*379.116*/("""
                                """),format.raw/*380.174*/("""
                                """),format.raw/*381.33*/("""<hr>
                                <ul class="list-inline team-social">
                                    <li>
                                        <a data-placement="top" data-toggle="tooltip" class="fb tooltips" data-original-title="Facebook" href="#">
                                            <i class="fa fa-facebook"></i></a>
                                    </li>
                                    <li>
                                        <a data-placement="top" data-toggle="tooltip" class="tw tooltips" data-original-title="Twitter" href="#">
                                            <i class="fa fa-twitter"></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-placement="top" data-toggle="tooltip" class="gp tooltips" data-original-title="Google plus" href="#">
                                            <i class="fa fa-google-plus"></i>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*405.2*/("""
"""),format.raw/*406.1*/("""<script>

        //$(".box-flip").flip();
        $(".box-flip").flip("""),format.raw/*409.29*/("""{"""),format.raw/*409.30*/("""
            """),format.raw/*410.13*/("""trigger: 'hover',
            reverse: true
        """),format.raw/*412.9*/("""}"""),format.raw/*412.10*/(""");

        /* function flipcardout()"""),format.raw/*414.34*/("""{"""),format.raw/*414.35*/("""
         """),format.raw/*415.10*/("""$(".box-flip").flip(false);
         """),format.raw/*416.10*/("""}"""),format.raw/*416.11*/("""*/
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
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 22:01:00 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/about.scala.html
                  HASH: 0db87b34d2085682cc24b6736cd5029e21418a8d
                  MATRIX: 527->1|639->18|666->20|678->25|715->54|754->56|785->61|857->107|871->113|937->159|6237->5432|6252->5438|6319->5483|7354->6986|7397->7000|7944->7519|7960->7525|8031->7573|8534->8076|8596->8109|9001->8797|9064->8971|9126->9004|10965->10815|10981->10821|11052->10869|11583->11400|11649->11437|11788->11859|11855->12037|11921->12074|13868->13993|13884->13999|13956->14048|14521->14613|14591->14654|14738->15092|14809->15274|14879->15315|16923->17331|16939->17337|17012->17387|17603->17978|17677->18023|17832->18477|17907->18663|17981->18708|19995->20694|20011->20700|20084->20750|20561->21227|20623->21260|20754->21666|20817->21840|20879->21873|22645->23611|22661->23617|22732->23665|23215->24148|23277->24181|23408->24587|23471->24761|23533->24794|24851->26081|24880->26082|24980->26153|25010->26154|25052->26167|25132->26219|25162->26220|25228->26257|25258->26258|25297->26268|25363->26305|25393->26306
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|28->4|28->4|28->4|120->96|120->96|120->96|143->126|145->128|152->135|152->135|152->135|162->145|163->146|167->152|168->153|169->154|197->182|197->182|197->182|207->192|208->193|210->197|211->198|212->199|240->227|240->227|240->227|250->237|251->238|253->242|254->243|255->244|284->273|284->273|284->273|294->283|295->284|298->289|299->290|300->291|327->318|327->318|327->318|337->328|338->329|341->334|342->335|343->336|370->363|370->363|370->363|380->373|381->374|384->379|385->380|386->381|410->405|411->406|414->409|414->409|415->410|417->412|417->412|419->414|419->414|420->415|421->416|421->416
                  -- GENERATED --
              */
          