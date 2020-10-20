package com.yunionyun.mcp.mcclient.managers;

import com.yunionyun.mcp.mcclient.EndpointType;

public class ComputeManager extends ResourceManager {
	/**
	 * @param keyword
	 * @param keywordPlural
	 * @param endpointType  EndpointType.InternalURL
	 * @param columns
	 * @param adminColumns
	 */
	public ComputeManager(
			String keyword,
			String keywordPlural,
			EndpointType endpointType,
			String[] columns,
			String[] adminColumns) {
		super("compute", endpointType, null, columns, adminColumns, keyword, keywordPlural, null);
	}

	public ComputeManager(
			String service,
			String keyword,
			String keywordPlural,
			EndpointType endpointType,
			String version,
			String[] columns,
			String[] adminColumns) {
		super(service, endpointType, version, columns, adminColumns, keyword, keywordPlural, null);
	}
}
