package com.bwie.model;

public class Country {
		private int cid;
		private String cname;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public Country(String cname) {
			super();
			this.cname = cname;
		}
		public Country(int cid, String cname) {
			super();
			this.cid = cid;
			this.cname = cname;
		}
		public Country() {
			super();
		}
		@Override
		public String toString() {
			return "Country [cid=" + cid + ", cname=" + cname + "]";
		}
		
}
