package com.way.utils;

public class DistanceUtils {

	/**
	 * 两点经纬度获取距离描述
	 * 
	 * @param longitude1
	 * @param latitude1
	 * @param longitude2
	 * @param latitude2
	 * @return
	 */
	public static String getDistanceStrByLoc(String longitude1, String latitude1, String longitude2, String latitude2) {
		String disStr = "";
		try {
			Double lng1 = Double.parseDouble(longitude1);
			Double lat1 = Double.parseDouble(latitude1);
			Double lng2 = Double.parseDouble(longitude2);
			Double lat2 = Double.parseDouble(latitude2);
			long dis = Math.round(6378.138 * 2
					* Math.asin(Math.sqrt(Math.pow(Math.sin((lat1 * Math.PI / 180 - lat2 * Math.PI / 180) / 2), 2)
							+ Math.cos(lat1 * Math.PI / 180) * Math.cos(lat2 * Math.PI / 180)
									* Math.pow(Math.sin((lng1 * Math.PI / 180 - lng2 * Math.PI / 180) / 2), 2)))
					* 1000);
			if (dis < 1000) {
				disStr = (dis / 100) + "米";
			} else {
				disStr = (dis / 1000) + "公里";
			}
		} catch (Exception e) {
			return "";
		}
		return disStr;
	}
}
