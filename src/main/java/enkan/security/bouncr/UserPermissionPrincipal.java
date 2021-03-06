package enkan.security.bouncr;

import enkan.security.UserPrincipal;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public class UserPermissionPrincipal implements Serializable, UserPrincipal {
    private final Long id;
    private final String account;
    private final Map<String, Object> profiles;
    private final Set<String> permissions;

    public UserPermissionPrincipal(Long id, String account, Map<String, Object> profiles, Set<String> permissions) {
        this.id = id;
        this.account = account;
        this.profiles = profiles;
        this.permissions = permissions;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return account;
    }

    @Override
    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }

    public Set<String> getPermissions() {
        return permissions;
    }

    public Map<String, Object> getProfiles() {
        return profiles;
    }
}
