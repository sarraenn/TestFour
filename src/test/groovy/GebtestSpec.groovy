import geb.spock.GebReportingSpec 
import spock.lang.*
import GebConfig


 

@Stepwise
class GebtestSpec extends GebReportingSpec {
	
	  def "Go to Facebook logn page"() {
		
		  when: "I'm login as a valid user"
		  to MainPage
		 
		  then: "I'm at the main page"
		  at MainPage
		 
	  }
	}