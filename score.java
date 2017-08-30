	public class Score {
		private String metric;
		private String value;

		public String getMetric() {
			return metric;
		}
		public void setMetric(String metric) {
			this.metric = metric;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public String toFormattedString() {
			String metricL = metric.toLowerCase();
			String valueL = value.toLowerCase();
			String metricF="";
			String valueF="";
			switch (metricL) {
			case "av":
				metricF="Attack Vector";
				switch (valueL) {
				case "n":
					valueF="Network";
					break;
				case "a":
					valueF="Adjacent";
					break;
				case "l":
					valueF="Local";
					break;
				case "p":
					valueF="Physical";
					break;
				}
				break;
			case "ac":
				metricF="Attack Complexity";
				switch (valueL) {
				case "l":
					valueF="Low";
					break;
				case "h":
					valueF="High";
					break;
				}
				break;
			case "pr":
				metricF="Privileges Required";
				switch (valueL) {
				case "n":
					valueF="None";
					break;
				case "l":
					valueF="Low";
					break;
				case "h":
					valueF="High";
					break;
				}
				break;
			case "ui":
				metricF="User Interaction";
				switch (valueL) {
				case "n":
					valueF="None";
					break;
				case "r":
					valueF="Required";
					break;
				}
				break;
			case "s":
				metricF="Scope";
				switch (valueL) {
				case "u":
					valueF="Unchanged";
					break;
				case "c":
					valueF="Changed";
					break;
				}
				break;
			case "c":
				metricF="Confidentiality";
				switch (valueL) {
				case "n":
					valueF="None";
					break;
				case "l":
					valueF="Low";
					break;
				case "h":
					valueF="High";
					break;
				}
				break;
			case "i":
				metricF="Integrity";
				switch (valueL) {
				case "n":
					valueF="None";
					break;
				case "l":
					valueF="Low";
					break;
				case "h":
					valueF="High";
					break;
				}
				break;
			case "a":
				metricF="Availability";
				switch (valueL) {
				case "n":
					valueF="None";
					break;
				case "l":
					valueF="Low";
					break;
				case "h":
					valueF="High";
					break;
				}
				break;
			case "e":
				metricF="Exploit Code Maturity";
				switch (valueL) {
				case "x":
					valueF="Not defined";
					break;
				case "u":
					valueF="Unproven";
					break;
				case "p":
					valueF="Proof-of-Concept";
					break;
				case "f":
					valueF="Functional";
					break;
				case "h":
					valueF="High";
					break;
				}
				break;
			case "rl":
				metricF="Remediation Level";
				switch (valueL) {
				case "x":
					valueF="Not defined";
					break;
				case "o":
					valueF="Official Fix";
					break;
				case "t":
					valueF="Temporary Fix";
					break;
				case "w":
					valueF="Workaround";
					break;
				case "u":
					valueF="Unavailable";
					break;
				}
				break;
			case "rc":
				metricF="Report Confidence";
				switch (valueL) {
				case "x":
					valueF="Not Defined";
					break;
				case "u":
					valueF="Unknown";
					break;
				case "r":
					valueF="Reasonable";
					break;
				case "c":
					valueF="Confirmed";
					break;
				}
				break;
			}
			return metricF+": "+valueF;
		}
	}
