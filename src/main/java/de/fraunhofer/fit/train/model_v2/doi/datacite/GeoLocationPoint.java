package de.fraunhofer.fit.train.model_v2.doi.datacite;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GeoLocationPoint {

	private String pointLatitude;

	private String pointLongitude;

	public String getPointLatitude() {
		return pointLatitude;
	}

	public void setPointLatitude(String pointLatitude) {
		this.pointLatitude = pointLatitude;
	}

	public String getPointLongitude() {
		return pointLongitude;
	}

	public void setPointLongitude(String pointLongitude) {
		this.pointLongitude = pointLongitude;
	}

	@Override
	public String toString() {
		return "ClassPojo [pointLatitude = " + pointLatitude + ", pointLongitude = " + pointLongitude + "]";
	}

}
