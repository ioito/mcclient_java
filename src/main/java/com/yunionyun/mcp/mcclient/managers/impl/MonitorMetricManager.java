package com.yunionyun.mcp.mcclient.managers.impl;

import java.util.Set;

import com.yunionyun.mcp.mcclient.Session;
import com.yunionyun.mcp.mcclient.managers.BaseMonitorManager;

public class MonitorMetricManager extends BaseMonitorManager {

	public MonitorMetricManager() {
		super("metric", "metrics",
		        new String[] {"id", "name", "description", "unit", "common_unit", "status", "create_by", "update_by", "delete_by", "gmt_create", "gmt_modified", "gmt_delete", "is_deleted", "project_id", "remark"},
		        new String[] {});
	}
	
	public void batchSubmit(Session s, Set<String> sets) {
		
	}
}
