package com.newtouch.yfy.api;

import com.newtouch.lion.model.BaseEntity;

public class Authorityfy extends BaseEntity<Long>{
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 5613252951753916410L;
		private Long            id;                // 
	    private String          hashKey;        // 
	    private String          alipayID;        // 
	    private String          agreementID;        // 
		@Override
		public Long getId() {
			// TODO Auto-generated method stub
			return id;
		}
		 
		public void setId(Long id) {
			this.id = id;
		}

		public String getHashKey() {
			return hashKey;
		}

		public void setHashKey(String hashKey) {
			this.hashKey = hashKey;
		}

		public String getAlipayID() {
			return alipayID;
		}

		public void setAlipayID(String alipayID) {
			this.alipayID = alipayID;
		}

		public String getAgreementID() {
			return agreementID;
		}

		public void setAgreementID(String agreementID) {
			this.agreementID = agreementID;
		}

		@Override
		public String toString() {
			return "Policy [hashKey=" + hashKey + ", alipayID=" + alipayID
					+ ", agreementID=" + agreementID + "]";
		}
		  
		
}
