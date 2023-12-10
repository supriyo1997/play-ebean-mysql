
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(books : List[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.22*/("""

"""),_display_(/*5.2*/layout("All Books")/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""

	"""),format.raw/*7.2*/("""<h1>All books</h1>

       <button type="button"><a href=""""),_display_(/*9.40*/routes/*9.46*/.BooksController.create()),format.raw/*9.71*/("""">NEW</a></button>
<br><br>
   		"""),_display_(/*11.7*/for(book <- books) yield /*11.25*/{_display_(Seq[Any](format.raw/*11.26*/("""
   		   """),format.raw/*12.9*/("""<a href=""""),_display_(/*12.19*/routes/*12.25*/.BooksController.show(book.id)),format.raw/*12.55*/("""">"""),_display_(/*12.58*/book/*12.62*/.title),format.raw/*12.68*/("""</a>
   		   <p>Price : """),_display_(/*13.21*/book/*13.25*/.price),format.raw/*13.31*/("""</p>
   		   <p>Author: """),_display_(/*14.21*/book/*14.25*/.author),format.raw/*14.32*/("""</p>
   		   
   		""")))}),format.raw/*16.7*/("""
""")))}),format.raw/*17.2*/("""


"""))
      }
    }
  }

  def render(books:List[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((List[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-12-09T22:58:48.214758700
                  SOURCE: C:/Users/DELL/Desktop/EBEAN/play-ebean/app/views/index.scala.html
                  HASH: b51b6f695348d8af91db42fdb4287991b0f42e50
                  MATRIX: 912->5|1027->25|1057->30|1084->49|1122->50|1153->55|1240->116|1254->122|1299->147|1361->183|1395->201|1434->202|1471->212|1508->222|1523->228|1574->258|1604->261|1617->265|1644->271|1697->297|1710->301|1737->307|1790->333|1803->337|1831->344|1883->366|1916->369
                  LINES: 27->3|32->3|34->5|34->5|34->5|36->7|38->9|38->9|38->9|40->11|40->11|40->11|41->12|41->12|41->12|41->12|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|45->16|46->17
                  -- GENERATED --
              */
          