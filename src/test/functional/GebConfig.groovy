
import org.openqa.selenium.firefox.FirefoxDriver

driver = {
	def driverInstance = new FirefoxDriver()
	driverInstance.manage().window().maximize()
	driverInstance
}

//def url = System.env['geb.build.baseUrl'] ?: "http://localhost:8080/${appName ?: 'sirh'}"
//baseUrl = url
baseUrl = 'http://www.facebook.com/'
reportsDir = 'target/geb-reports'
reportsDir = 'target/geb-reports'
println "="*80
println "GEB BASE URL $url"
println "="*80
//baseNavigatorWaiting = true
//atCheckWaiting = true








