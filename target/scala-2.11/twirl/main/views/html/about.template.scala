
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
            <div class="title-box-v2">
                <h2>Build Your <span class="color-green">Own</span> Talents</h2>
                <p>Aside from being high performance... we're also the nicest people you'll ever meet.
                    Our mission is to build a bridge between employee and employer. 
                    We achieved this status by the dedicated accomplishment of a highly motivated,
                    professional and experience team who are highly dedicated.</p>
            </div>

            <div class="row">
                    <!-- Team v2 -->
                <div class="col-md-3 col-sm-6">
                    <div class="box-flip box-color box-icon box-icon-center box-icon-round box-icon-large text-center flip" style="min-height: 436px ;">
                        <div class="front">
                            <div class="box1 box-default" style="min-height: 436px ;">
                                <span class="box-icon-title">
                                    <img class="img-responsive" src=""""),_display_(/*134.71*/routes/*134.77*/.Assets.versioned("images/about/team/rahul.jpg")),format.raw/*134.125*/("""" alt="">
                                    <h2>Rahul Chaudhary</h2>
                                    <small>Co-Founder</small>
                                </span>
                            </div>
                        </div>

                        <div class="back">
                            <div class="box2 box-default" style="min-height: 436px ;">
                                <h4 class="nomargin">Rahul Chaudhary</h4>
                                """),format.raw/*144.62*/("""
                                """),format.raw/*145.33*/("""<hr>
                                <p>Enthusiastic & Passionate about recruitment, Result Oriented, Perseverant</p>
                                <p>Experience in sourcing using: internet channels, through Agents, employee referrals,
                                   job boards, cold calling, and other innovative search techniques.</p>
                                """),format.raw/*151.120*/("""
                                """),format.raw/*152.174*/("""
                                """),format.raw/*153.33*/("""<hr>
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
                                        <img class="img-responsive" src=""""),_display_(/*181.75*/routes/*181.81*/.Assets.versioned("images/about/team/nitin.jpg")),format.raw/*181.129*/("""" alt="">
                                        <h2>Nitin Tyagi</h2>
                                        <small>Director</small>
                                    </span>
                                </div>
                            </div>

                            <div class="back">
                                <div class="box2 box-default" style="min-height: 436px ;">
                                    <h4 class="nomargin">Nitin Tyagi</h4>
                                    """),format.raw/*191.66*/("""
                                    """),format.raw/*192.37*/("""<hr>
                                     <p>Contact me on following</p>
                                    """),format.raw/*196.120*/("""
                                    """),format.raw/*197.178*/("""
                                    """),format.raw/*198.37*/("""<hr>
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
                                            <img class="img-responsive" src=""""),_display_(/*226.79*/routes/*226.85*/.Assets.versioned("images/about/team/chetan.jpg")),format.raw/*226.134*/("""" alt="">
                                            <h2>Chetan Sharma</h2>
                                            <small>HR Manager</small>
                                        </span>
                                    </div>
                                </div>

                                <div class="back">
                                    <div class="box2 box-default" style="min-height: 436px ;">
                                        <h4 class="nomargin">Chetan Sharma</h4>
                                        """),format.raw/*236.70*/("""
                                        """),format.raw/*237.41*/("""<hr>
                                         <p>Contact me on following</p>
                                        """),format.raw/*241.124*/("""
                                        """),format.raw/*242.182*/("""
                                        """),format.raw/*243.41*/("""<hr>
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
                                                <img class="img-responsive" src=""""),_display_(/*272.83*/routes/*272.89*/.Assets.versioned("images/about/team/avinash.jpg")),format.raw/*272.139*/("""" alt="">
                                                <h2>Avinash</h2>
                                                <small>Accountant</small>
                                            </span>
                                        </div>
                                    </div>

                                    <div class="back">
                                        <div class="box2 box-default" style="min-height: 436px ;">
                                            <h4 class="nomargin">Avinash</h4>
                                            """),format.raw/*282.74*/("""
                                            """),format.raw/*283.45*/("""<hr>
                                            <p>Contact me on following</p>

                                            """),format.raw/*288.128*/("""
                                            """),format.raw/*289.186*/("""
                                            """),format.raw/*290.45*/("""<hr>
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
            </div>
        </div>
    </div>
""")))}),format.raw/*315.2*/("""
"""),format.raw/*316.1*/("""<script>

        //$(".box-flip").flip();
        $(".box-flip").flip("""),format.raw/*319.29*/("""{"""),format.raw/*319.30*/("""
            """),format.raw/*320.13*/("""trigger: 'hover',
            reverse: true
        """),format.raw/*322.9*/("""}"""),format.raw/*322.10*/(""");

        /* function flipcardout()"""),format.raw/*324.34*/("""{"""),format.raw/*324.35*/("""
         """),format.raw/*325.10*/("""$(".box-flip").flip(false);
         """),format.raw/*326.10*/("""}"""),format.raw/*326.11*/("""*/
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
                  DATE: Sat Nov 05 19:20:42 IST 2016
                  SOURCE: /home/ashu/Documents/projects/anaraconsultant/app/views/about.scala.html
                  HASH: cc17c20122bce5481b416070d3d145a7b4017dfd
                  MATRIX: 527->1|639->18|666->20|678->25|715->54|754->56|785->61|857->107|871->113|937->159|6237->5432|6252->5438|6319->5483|8382->7518|8398->7524|8469->7572|8974->8077|9036->8110|9441->8798|9504->8972|9566->9005|11405->10816|11421->10822|11492->10870|12023->11401|12089->11438|12228->11860|12295->12038|12361->12075|14308->13994|14324->14000|14396->14049|14969->14622|15039->14663|15186->15101|15257->15283|15327->15324|17371->17340|17387->17346|17460->17396|18057->17993|18131->18038|18286->18492|18361->18678|18435->18723|20034->20291|20063->20292|20163->20363|20193->20364|20235->20377|20315->20429|20345->20430|20411->20467|20441->20468|20480->20478|20546->20515|20576->20516
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|28->4|28->4|28->4|120->96|120->96|120->96|158->134|158->134|158->134|168->144|169->145|173->151|174->152|175->153|203->181|203->181|203->181|213->191|214->192|216->196|217->197|218->198|246->226|246->226|246->226|256->236|257->237|259->241|260->242|261->243|290->272|290->272|290->272|300->282|301->283|304->288|305->289|306->290|331->315|332->316|335->319|335->319|336->320|338->322|338->322|340->324|340->324|341->325|342->326|342->326
                  -- GENERATED --
              */
          