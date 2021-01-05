package org.example.useraccess.domain.UserAccess;

import java.util.ArrayList;

public class ListUserRole extends ArrayList<ListUserRole.ListUserRoleItem> {

    public static class ListUserRoleItem {

        public ListUserRoleItem() {
        }

        private UserRole userRole;

        public UserRole getUserRole() {
            return userRole;
        }

        public void setUserRole(UserRole userRole) {
            this.userRole = userRole;
        }

        public ListUserRoleItem(UserRole userRole) {
            this.userRole = userRole;
        }
    }
}
