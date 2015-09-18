import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;

import spock.lang.*



class SpockTestSpec extends spock.lang.Specification {
	def "length of Spock's and his friends' names"() {
		expect:
		name.size() == length

		where:
		name     | length
		"Spock"  | 5
		"Kirk"   | 4
		"Scotty" | 6
	}
	
	
	
	
	
}
