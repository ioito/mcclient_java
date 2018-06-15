package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.BaseLogActionManager;

public class LogActionManager extends BaseLogActionManager
{

    public LogActionManager()
    {
        super("action", "actions", new String[] {"obj_type", "obj_id", "obj_name", "success", "action", "notes", "user_id", "user", "tenant_id", "tenant"}, new String[] {});
    }
    
}
