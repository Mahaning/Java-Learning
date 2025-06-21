/**
 * Build a Bitmask Authorization System
 *
 * Problem: Suppose you have 4 permissions represented as bits:
 * 0: Read
 * 1: Write
 * 2: Execute
 * 3: Delete
 * Each user has a bitmask (int) representing their permissions. Write a function to:
 * Check if a user has specific permission.
 * Grant a permission.
 * Revoke a permission.
 */


public class BitmaskAuthorizationSystem {

    // Permission constants using bit shifts
    public static final int READ    = 1 << 0; // 0001 = 1
    public static final int WRITE   = 1 << 1; // 0010 = 2
    public static final int EXECUTE = 1 << 2; // 0100 = 4
    public static final int DELETE  = 1 << 3; // 1000 = 8

    // 1. Check if user has a specific permission
    public static boolean hasPermission(int bitmask, int permission) {
        return (bitmask & permission) != 0;
    }

    // 2. Grant a permission (set the bit)
    public static int grantPermission(int bitmask, int permission) {
        return bitmask | permission;
    }

    // 3. Revoke a permission (unset the bit)
    public static int revokePermission(int bitmask, int permission) {
        return bitmask & ~permission;
    }

    // Utility to print user permissions
    public static void printPermissions(int bitmask) {
        System.out.println("User Permissions:");
        if (hasPermission(bitmask, READ))    System.out.println(" - Read");
        if (hasPermission(bitmask, WRITE))   System.out.println(" - Write");
        if (hasPermission(bitmask, EXECUTE)) System.out.println(" - Execute");
        if (hasPermission(bitmask, DELETE))  System.out.println(" - Delete");
    }

    public static void main(String[] args) {
        int userPermissions = 0; // Initially no permissions

        // Grant READ and EXECUTE
        userPermissions = grantPermission(userPermissions, READ);
        userPermissions = grantPermission(userPermissions, EXECUTE);
        printPermissions(userPermissions); // Shows Read and Execute

        // Check if WRITE permission is present
        System.out.println("\nHas Write? " + hasPermission(userPermissions, WRITE)); // false

        // Grant WRITE permission
        userPermissions = grantPermission(userPermissions, WRITE);
        System.out.println("\nAfter granting WRITE:");
        printPermissions(userPermissions); // Now has Read, Execute, and Write

        // Revoke EXECUTE permission
        userPermissions = revokePermission(userPermissions, EXECUTE);
        System.out.println("\nAfter revoking EXECUTE:");
        printPermissions(userPermissions); // Only Read and Write
    }
}

