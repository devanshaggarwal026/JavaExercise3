package com.robomq.assignment3;

public class Election {
		private int electionId;
		private String name , eDate , ditrict , constituency , countingDate ;
		public Election(int electionId, String name, String eDate, String ditrict, String constituency,
				String countingDate) {
			super();
			this.electionId = electionId;
			this.name = name;
			this.eDate = eDate;
			this.ditrict = ditrict;
			this.constituency = constituency;
			this.countingDate = countingDate;
		}
		public int getElectionId() {
			return electionId;
		}
		public void setElectionId(int electionId) {
			this.electionId = electionId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String geteDate() {
			return eDate;
		}
		public void seteDate(String eDate) {
			this.eDate = eDate;
		}
		public String getDitrict() {
			return ditrict;
		}
		public void setDitrict(String ditrict) {
			this.ditrict = ditrict;
		}
		public String getConstituency() {
			return constituency;
		}
		public void setConstituency(String constituency) {
			this.constituency = constituency;
		}
		public String getCountingDate() {
			return countingDate;
		}
		public void setCountingDate(String countingDate) {
			this.countingDate = countingDate;
		}
		@Override
		public int hashCode() {
			return name.hashCode();
		}
		@Override
		public String toString() {
			return "Election [electionId=" + electionId + ", name=" + name + ", eDate=" + eDate + ", ditrict=" + ditrict
					+ ", constituency=" + constituency + ", countingDate=" + countingDate + "]";
		}
		@Override
		public boolean equals(Object obj) {
			boolean flag = false ;
			if(obj instanceof Election) {
				Election e = (Election)obj;
				if(e.name==this.name){
					flag = true;
				}
			}
			return flag;
		}
		
		
}
