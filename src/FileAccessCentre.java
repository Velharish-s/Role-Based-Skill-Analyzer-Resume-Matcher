import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class FileAccessCentre {
	static int count=0;
	static int wordsSize=0;
	static void check(String currentSelection,ArrayList<String> words) {
		wordsSize=words.size();
		ArrayList<String> newWords=new ArrayList<>();
		String accumulator=new String();
		for(int i=0;i<currentSelection.length()-1;i++) {
			if(( currentSelection.charAt(i)==' ' && currentSelection.charAt(i+1)==',') || currentSelection.charAt(i)==',') {
				if(accumulator.length()!=0) {
					newWords.add(accumulator);
					accumulator="";
				}
			}
			if((currentSelection.charAt(i)==' ' && currentSelection.charAt(i+1)!=' ') || currentSelection.charAt(i)!=',')
			accumulator+=currentSelection.charAt(i);
			if(accumulator.length()!=0) {
				newWords.add(accumulator);
			}
			for(int i1=0;i1<newWords.size();i1++) {
				if(words.contains(newWords.get(i))) {
					count++;
				}
			}
		}
	}
	static void fileAccess(ArrayList<String> words) {
		String filePath=InputCentre.stringGetter();
		try(Scanner read=new Scanner(new File(filePath))){
			while(read.hasNext()) {
				String currentLine=read.next();
				check(currentLine,words);
			}
			if(read!=null)
			read.close();
		}catch(Exception e) {
			System.out.println("! invalid filepath");
		}
	}
}
class Key{
	String keys;
	Key(String input){
		keys=input;
	}
}
class IntialDetails{
	static Key keys[]=new Key[24];
	static void dataInsert(boolean decision,int n) {
		if(decision) {
			keys[0]=new Key("Java, OOP, Software Development Life Cycle (SDLC), Agile, REST API, Git, Debugging, Data Structures, Design Patterns, Spring Boot, Multithreading, Maven, JUnit\r\n");
			keys[1]=new Key("Java, Node.js, Python, RESTful APIs, Spring Boot, Hibernate, SQL, MongoDB, Microservices, Authentication, Docker, Kubernetes, Redis, AWS, CI/CD");
			keys[2]=new Key("HTML5, CSS3, JavaScript, React.js, Angular, TypeScript, Responsive Design, Figma, DOM Manipulation, Cross-Browser Compatibility, Bootstrap, Webpack");
			keys[3]=new Key("React, Node.js, Express, MongoDB, MERN, LAMP, REST API, Docker, Git, CI/CD, AWS, SQL, Authentication, JWT, GraphQL");
			keys[4]=new Key("Android, Kotlin, Java, Swift, iOS, Flutter, React Native, Play Store Deployment, Firebase, MVVM, Jetpack, Xcode, REST API Integration");
			keys[5]=new Key("Unity, Unreal Engine, C#, C++, Game Loop, Physics Engine, 2D/3D Rendering, Animation, AI in Games, Multiplayer Networking");
			keys[6]=new Key("C, C++, Embedded C, Microcontrollers, RTOS, UART, SPI, I2C, Assembly, IoT, Hardware Debugging, Oscilloscope");
			keys[7]=new Key("Excel, SQL, Power BI, Tableau, Data Cleaning, Data Visualization, Statistics, Python, Pandas, Reporting, Pivot Tables");
			keys[8]=new Key("Python, Machine Learning, Pandas, NumPy, scikit-learn, TensorFlow, PyTorch, Statistics, Jupyter, Data Modeling, NLP");
			keys[9]=new Key("Deep Learning, CNN, RNN, NLP, Transformers, PyTorch, TensorFlow, Model Deployment, Data Preprocessing, ML Ops, OpenCV");
			keys[10]=new Key("ETL, Hadoop, Spark, Kafka, Airflow, BigQuery, SQL, NoSQL, Snowflake, Data Warehousing, Cloud Storage, Data Pipeline");
			keys[11]=new Key("Power BI, Tableau, SQL, Data Modeling, DAX, KPIs, Dashboarding, Reporting, ETL, SSRS, SSIS, Excel");
			keys[12]=new Key("Jenkins, Docker, Kubernetes, Git, Terraform, CI/CD, Bash Scripting, Monitoring, Prometheus, Grafana, AWS, Ansible");
			keys[13]=new Key("AWS, Azure, GCP, EC2, S3, IAM, Lambda, VPC, CloudFormation, Terraform, DevOps, Auto Scaling, Cloud Security");
			keys[14]=new Key("Linux, Windows Server, Active Directory, Shell Scripting, DNS, DHCP, Patch Management, Virtualization, Backups, Monitoring");
			keys[15]=new Key("CCNA, Routing, Switching, Subnetting, Firewalls, TCP/IP, VPN, LAN/WAN, Cisco, Load Balancing, Network Security");
			keys[16]=new Key("Manual Testing, STLC, SDLC, Bug Reporting, Test Case Design, Regression Testing, Jira, Functional Testing, Smoke Testing");
			keys[17]=new Key("Selenium, TestNG, JUnit, Maven, Automation Framework, Java, CI/CD, Page Object Model, API Testing, Postman, Jenkins");
			keys[18]=new Key("Firewalls, SIEM, SOC, Threat Detection, IDS/IPS, Incident Response, Malware Analysis, Vulnerability Scanning, Security Audits");
			keys[19]=new Key("CEH, Penetration Testing, Burp Suite, Kali Linux, OWASP Top 10, Nmap, Metasploit, SQL Injection, XSS, Reverse Engineering");
			keys[20]=new Key("HTML, CSS, JavaScript, React, Angular, Responsive Design, Bootstrap, Git, jQuery, SEO Basics, API Integration");
			keys[21]=new Key("Figma, Adobe XD, Wireframing, Prototyping, User Flow, User-Centered Design, Accessibility, Visual Design, Heuristics");
			keys[22]=new Key("Adobe Photoshop, Illustrator, InDesign, Canva, Typography, Logo Design, Branding, Layout, Color Theory, UI Assets");
		}
		else {
			String currentSelection=keys[n-1].keys;
			ArrayList<String> words=new ArrayList<>();
			String accumulator=new String();
			for(int i=0;i<currentSelection.length()-1;i++) {
				if(( currentSelection.charAt(i)==' ' && currentSelection.charAt(i+1)==',') || currentSelection.charAt(i)==',') {
					if(accumulator.length()!=0) {
						words.add(accumulator);
						accumulator="";
					}
				}
				if((currentSelection.charAt(i)==' ' && currentSelection.charAt(i+1)!=' ') || currentSelection.charAt(i)!=',')
				accumulator+=currentSelection.charAt(i);
			}
			if(accumulator.length()!=0) {
				words.add(accumulator);
			}
//			System.out.println("currentSelection"+currentSelection);
//			System.out.print("words"+words);//print statement
			FileAccessCentre.fileAccess(words);
		}
	}
	static void displayRole() {
		System.out.println("1.Software Developer / Engineer");
		System.out.println("2.Backend Developer");
		System.out.println("3.Frontend Developer");
		System.out.println("4.Full-Stack Developer");
		System.out.println("5.Mobile App Developer");
		System.out.println("6.Game Developer");
		System.out.println("7.Embedded Systems Engineer");
		System.out.println("8.Data Analyst");
		System.out.println("9.Data Scientist");
		System.out.println("10.ML/AI Engineer");
		System.out.println("11.Data Engineer");
		System.out.println("12.BI Developer");
		System.out.println("13.DevOps Engineer");
		System.out.println("14.Cloud Engineer");
		System.out.println("15.System Administrator");
		System.out.println("16.Network Engineer");
		System.out.println("17.QA Engineer / Tester");
		System.out.println("18.Automation Tester");
		System.out.println("19.Cybersecurity Analyst");
		System.out.println("20.Ethical Hacker / Pen Tester");
		System.out.println("21.Web Developer");
		System.out.println("22.UI/UX Designer");
		System.out.println("23.Graphic Designer");
		int userSelection=0;
		while(true) {
			userSelection=InputCentre.intGetter();
			if(userSelection>=1 && userSelection<=23) {
				break;
			}
		}
		dataInsert(false,userSelection);
	}
}
