package com.ms.interviews.uag.core;

import com.ms.interviews.uag.api.GroupService;
import com.ms.interviews.uag.api.MembershipService;
import com.ms.interviews.uag.api.UserService;

/**
 * Provides access to all of the services so that circular dependencies between them can be resolved.
 */
public interface Services {
    GroupService getGroupService();

    UserService getUserService();

    MembershipService getMembershipService();
}
