package gov.uspto.patent.model.classification;

public enum ClassificationType {

	/*
	 *  IPC - WIPO classification system, 1975 to present.
	 *  IPC revised on a yearly basis.
	 *  http://www.wipo.int/classifications/ipc/en/
	 */
	IPC("International Patent Classification", IpcClassification.class),

	/* 
	 * CPC, developed jointly between USPTO and EPO. IPC-compliant makes CPC similar to IPC.
	 * CPC has many more subdivisions and subgroups than the IPC. Some IPC groups are not used in the CPC.
	 * CPC revised on a monthly basis, IPC revised on yearly basis.
	 * USPTO releases updates on the first Tuesday of every month.
	 * 
	 * http://www.cooperativepatentclassification.org
	 * http://www.uspto.gov/patents-application-process/patent-search/understanding-patent-classifications/cooperative-patent
	 * 
	 */
	CPC("Cooperative Patent Classification", CpcClassification.class),
	
	/* 
	 * USPC, USPTO Legacy Classification System.
	 * Replace by CPC on Jan 1, 2015 (except for plant and design patents)
	 */
	USPC("United States Patent Classification", UspcClassification.class),

	/* 
	 * ECLA, EPO legacy Classification System. 
	 * Based on IPC, and replaced with CPC on Jan 1, 2013.
	 */
	ECLA("European Classification", PatentClassification.class),

	/*
	 * DWPI, Derwent World Patent Index by Tomson Reuters
	 */
	DWPI("Derwent World Patent Index", DwpiClassification.class),

	/*
	 * International classification used for the purposes of the registration of industrial designs
	 * adopted October 8, 1968
	 */
	LOCARNO("Locarno Classification", LocarnoClassification.class),

	/*
	 * Unknown.
	 */
	UNKNOWN("Unknown", PatentClassification.class);

	private String desc;
	private Class claz;

	<T extends PatentClassification> ClassificationType(String desc, Class<T> claz){
		this.desc = desc;
		this.claz = claz;
	}

	public <T extends PatentClassification> Class<T> getJavaClass(){
		return claz;
	}

	public String getDescription(){
		return desc;
	}
}
