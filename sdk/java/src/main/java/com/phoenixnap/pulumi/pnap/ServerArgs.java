// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap;

import com.phoenixnap.pulumi.pnap.inputs.ServerCloudInitArgs;
import com.phoenixnap.pulumi.pnap.inputs.ServerNetrisSoftgateArgs;
import com.phoenixnap.pulumi.pnap.inputs.ServerNetworkConfigurationArgs;
import com.phoenixnap.pulumi.pnap.inputs.ServerStorageConfigurationArgs;
import com.phoenixnap.pulumi.pnap.inputs.ServerTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

    /**
     * Action to perform on server. Allowed actions are: reboot, reset (deprecated), powered-on, powered-off, shutdown.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Action to perform on server. Allowed actions are: reboot, reset (deprecated), powered-on, powered-off, shutdown.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Cloud-init configuration details. Structure is documented below.
     * 
     */
    @Import(name="cloudInit")
    private @Nullable Output<ServerCloudInitArgs> cloudInit;

    /**
     * @return Cloud-init configuration details. Structure is documented below.
     * 
     */
    public Optional<Output<ServerCloudInitArgs>> cloudInit() {
        return Optional.ofNullable(this.cloudInit);
    }

    /**
     * Server description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Server description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Query parameter controlling advanced features availability. Currently applicable for networking. It is advised to use with caution since it might lead to unhealthy setups.
     * 
     * The `cloud_init` block has one field:
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return Query parameter controlling advanced features availability. Currently applicable for networking. It is advised to use with caution since it might lead to unhealthy setups.
     * 
     * The `cloud_init` block has one field:
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * Server hostname.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return Server hostname.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    @Import(name="installDefaultSshKeys")
    private @Nullable Output<Boolean> installDefaultSshKeys;

    public Optional<Output<Boolean>> installDefaultSshKeys() {
        return Optional.ofNullable(this.installDefaultSshKeys);
    }

    /**
     * If true, OS will be installed to and booted from the server&#39;s RAM. On restart RAM OS will be lost and the server will not be reachable unless a custom bootable OS has been deployed. Only supported for ubuntu/focal. Default value is `false`.
     * 
     */
    @Import(name="installOsToRam")
    private @Nullable Output<Boolean> installOsToRam;

    /**
     * @return If true, OS will be installed to and booted from the server&#39;s RAM. On restart RAM OS will be lost and the server will not be reachable unless a custom bootable OS has been deployed. Only supported for ubuntu/focal. Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> installOsToRam() {
        return Optional.ofNullable(this.installOsToRam);
    }

    /**
     * Server Location ID. Cannot be changed once a server is created (e.g., PHX). For a full list of available locations visit [API docs](https://developers.phoenixnap.com/docs/bmc/1)
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return Server Location ID. Cannot be changed once a server is created (e.g., PHX). For a full list of available locations visit [API docs](https://developers.phoenixnap.com/docs/bmc/1)
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Define list of IPs allowed to access the Management UI. Supported in single IP, CIDR and range format. When undefined, Management UI is disabled.Must contain at least 1 item.
     * 
     */
    @Import(name="managementAccessAllowedIps")
    private @Nullable Output<List<String>> managementAccessAllowedIps;

    /**
     * @return Define list of IPs allowed to access the Management UI. Supported in single IP, CIDR and range format. When undefined, Management UI is disabled.Must contain at least 1 item.
     * 
     */
    public Optional<Output<List<String>>> managementAccessAllowedIps() {
        return Optional.ofNullable(this.managementAccessAllowedIps);
    }

    /**
     * Netris Softgate configuration properties. Follow [instructions](https://phoenixnap.com/kb/netris-bare-metal-cloud#deploy-netris-softgate) for retrieving the required details. Structure is documented below.
     * 
     */
    @Import(name="netrisSoftgate")
    private @Nullable Output<ServerNetrisSoftgateArgs> netrisSoftgate;

    /**
     * @return Netris Softgate configuration properties. Follow [instructions](https://phoenixnap.com/kb/netris-bare-metal-cloud#deploy-netris-softgate) for retrieving the required details. Structure is documented below.
     * 
     */
    public Optional<Output<ServerNetrisSoftgateArgs>> netrisSoftgate() {
        return Optional.ofNullable(this.netrisSoftgate);
    }

    /**
     * Entire network details of bare metal server. Structure is documented below.
     * 
     */
    @Import(name="networkConfiguration")
    private @Nullable Output<ServerNetworkConfigurationArgs> networkConfiguration;

    /**
     * @return Entire network details of bare metal server. Structure is documented below.
     * 
     */
    public Optional<Output<ServerNetworkConfigurationArgs>> networkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }

    /**
     * The type of network configuration for this server. Currently this field should be set to PUBLIC_AND_PRIVATE, PRIVATE_ONLY, PUBLIC_ONLY or USER_DEFINED. Setting the force query parameter to `true` allows you to configure network configuration type as NONE.
     * 
     */
    @Import(name="networkType")
    private @Nullable Output<String> networkType;

    /**
     * @return The type of network configuration for this server. Currently this field should be set to PUBLIC_AND_PRIVATE, PRIVATE_ONLY, PUBLIC_ONLY or USER_DEFINED. Setting the force query parameter to `true` allows you to configure network configuration type as NONE.
     * 
     */
    public Optional<Output<String>> networkType() {
        return Optional.ofNullable(this.networkType);
    }

    /**
     * The server’s OS ID used when the server was created (e.g., ubuntu/bionic, centos/centos7). For a full list of available operating systems visit [API docs](https://developers.phoenixnap.com/docs/bmc/1).
     * 
     */
    @Import(name="os", required=true)
    private Output<String> os;

    /**
     * @return The server’s OS ID used when the server was created (e.g., ubuntu/bionic, centos/centos7). For a full list of available operating systems visit [API docs](https://developers.phoenixnap.com/docs/bmc/1).
     * 
     */
    public Output<String> os() {
        return this.os;
    }

    /**
     * Server pricing model. Currently this field should be set to HOURLY, ONE_MONTH_RESERVATION, TWELVE_MONTHS_RESERVATION, TWENTY_FOUR_MONTHS_RESERVATION or THIRTY_SIX_MONTHS_RESERVATION.
     * 
     */
    @Import(name="pricingModel")
    private @Nullable Output<String> pricingModel;

    /**
     * @return Server pricing model. Currently this field should be set to HOURLY, ONE_MONTH_RESERVATION, TWELVE_MONTHS_RESERVATION, TWENTY_FOUR_MONTHS_RESERVATION or THIRTY_SIX_MONTHS_RESERVATION.
     * 
     */
    public Optional<Output<String>> pricingModel() {
        return Optional.ofNullable(this.pricingModel);
    }

    /**
     * List of IPs allowed for RDP access to Windows OS. Supported in single IP, CIDR and range format. When undefined, RDP is disabled. To allow RDP access from any IP use 0.0.0.0/0. Must contain at least 1 item.
     * 
     */
    @Import(name="rdpAllowedIps")
    private @Nullable Output<List<String>> rdpAllowedIps;

    /**
     * @return List of IPs allowed for RDP access to Windows OS. Supported in single IP, CIDR and range format. When undefined, RDP is disabled. To allow RDP access from any IP use 0.0.0.0/0. Must contain at least 1 item.
     * 
     */
    public Optional<Output<List<String>>> rdpAllowedIps() {
        return Optional.ofNullable(this.rdpAllowedIps);
    }

    /**
     * Server reservation ID.
     * 
     */
    @Import(name="reservationId")
    private @Nullable Output<String> reservationId;

    /**
     * @return Server reservation ID.
     * 
     */
    public Optional<Output<String>> reservationId() {
        return Optional.ofNullable(this.reservationId);
    }

    /**
     * A list of SSH key IDs that will be installed on the server in addition to any SSH keys specified in this request.
     * 
     */
    @Import(name="sshKeyIds")
    private @Nullable Output<List<String>> sshKeyIds;

    /**
     * @return A list of SSH key IDs that will be installed on the server in addition to any SSH keys specified in this request.
     * 
     */
    public Optional<Output<List<String>>> sshKeyIds() {
        return Optional.ofNullable(this.sshKeyIds);
    }

    /**
     * A list of SSH Keys that will be installed on the server.
     * 
     */
    @Import(name="sshKeys")
    private @Nullable Output<List<String>> sshKeys;

    /**
     * @return A list of SSH Keys that will be installed on the server.
     * 
     */
    public Optional<Output<List<String>>> sshKeys() {
        return Optional.ofNullable(this.sshKeys);
    }

    /**
     * Storage configuration. Structure is documented below.
     * 
     */
    @Import(name="storageConfiguration")
    private @Nullable Output<ServerStorageConfigurationArgs> storageConfiguration;

    /**
     * @return Storage configuration. Structure is documented below.
     * 
     */
    public Optional<Output<ServerStorageConfigurationArgs>> storageConfiguration() {
        return Optional.ofNullable(this.storageConfiguration);
    }

    /**
     * Tags to set to server, if any. Structure is documented below.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ServerTagArgs>> tags;

    /**
     * @return Tags to set to server, if any. Structure is documented below.
     * 
     */
    public Optional<Output<List<ServerTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Server type ID. Cannot be changed once a server is created (e.g., s1.c1.small, s1.c1.medium). For a full list of available types visit [API docs](https://developers.phoenixnap.com/docs/bmc/1).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Server type ID. Cannot be changed once a server is created (e.g., s1.c1.small, s1.c1.medium). For a full list of available types visit [API docs](https://developers.phoenixnap.com/docs/bmc/1).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ServerArgs() {}

    private ServerArgs(ServerArgs $) {
        this.action = $.action;
        this.cloudInit = $.cloudInit;
        this.description = $.description;
        this.force = $.force;
        this.hostname = $.hostname;
        this.installDefaultSshKeys = $.installDefaultSshKeys;
        this.installOsToRam = $.installOsToRam;
        this.location = $.location;
        this.managementAccessAllowedIps = $.managementAccessAllowedIps;
        this.netrisSoftgate = $.netrisSoftgate;
        this.networkConfiguration = $.networkConfiguration;
        this.networkType = $.networkType;
        this.os = $.os;
        this.pricingModel = $.pricingModel;
        this.rdpAllowedIps = $.rdpAllowedIps;
        this.reservationId = $.reservationId;
        this.sshKeyIds = $.sshKeyIds;
        this.sshKeys = $.sshKeys;
        this.storageConfiguration = $.storageConfiguration;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerArgs $;

        public Builder() {
            $ = new ServerArgs();
        }

        public Builder(ServerArgs defaults) {
            $ = new ServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action to perform on server. Allowed actions are: reboot, reset (deprecated), powered-on, powered-off, shutdown.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action to perform on server. Allowed actions are: reboot, reset (deprecated), powered-on, powered-off, shutdown.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param cloudInit Cloud-init configuration details. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cloudInit(@Nullable Output<ServerCloudInitArgs> cloudInit) {
            $.cloudInit = cloudInit;
            return this;
        }

        /**
         * @param cloudInit Cloud-init configuration details. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cloudInit(ServerCloudInitArgs cloudInit) {
            return cloudInit(Output.of(cloudInit));
        }

        /**
         * @param description Server description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Server description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param force Query parameter controlling advanced features availability. Currently applicable for networking. It is advised to use with caution since it might lead to unhealthy setups.
         * 
         * The `cloud_init` block has one field:
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force Query parameter controlling advanced features availability. Currently applicable for networking. It is advised to use with caution since it might lead to unhealthy setups.
         * 
         * The `cloud_init` block has one field:
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param hostname Server hostname.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Server hostname.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        public Builder installDefaultSshKeys(@Nullable Output<Boolean> installDefaultSshKeys) {
            $.installDefaultSshKeys = installDefaultSshKeys;
            return this;
        }

        public Builder installDefaultSshKeys(Boolean installDefaultSshKeys) {
            return installDefaultSshKeys(Output.of(installDefaultSshKeys));
        }

        /**
         * @param installOsToRam If true, OS will be installed to and booted from the server&#39;s RAM. On restart RAM OS will be lost and the server will not be reachable unless a custom bootable OS has been deployed. Only supported for ubuntu/focal. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder installOsToRam(@Nullable Output<Boolean> installOsToRam) {
            $.installOsToRam = installOsToRam;
            return this;
        }

        /**
         * @param installOsToRam If true, OS will be installed to and booted from the server&#39;s RAM. On restart RAM OS will be lost and the server will not be reachable unless a custom bootable OS has been deployed. Only supported for ubuntu/focal. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder installOsToRam(Boolean installOsToRam) {
            return installOsToRam(Output.of(installOsToRam));
        }

        /**
         * @param location Server Location ID. Cannot be changed once a server is created (e.g., PHX). For a full list of available locations visit [API docs](https://developers.phoenixnap.com/docs/bmc/1)
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Server Location ID. Cannot be changed once a server is created (e.g., PHX). For a full list of available locations visit [API docs](https://developers.phoenixnap.com/docs/bmc/1)
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managementAccessAllowedIps Define list of IPs allowed to access the Management UI. Supported in single IP, CIDR and range format. When undefined, Management UI is disabled.Must contain at least 1 item.
         * 
         * @return builder
         * 
         */
        public Builder managementAccessAllowedIps(@Nullable Output<List<String>> managementAccessAllowedIps) {
            $.managementAccessAllowedIps = managementAccessAllowedIps;
            return this;
        }

        /**
         * @param managementAccessAllowedIps Define list of IPs allowed to access the Management UI. Supported in single IP, CIDR and range format. When undefined, Management UI is disabled.Must contain at least 1 item.
         * 
         * @return builder
         * 
         */
        public Builder managementAccessAllowedIps(List<String> managementAccessAllowedIps) {
            return managementAccessAllowedIps(Output.of(managementAccessAllowedIps));
        }

        /**
         * @param managementAccessAllowedIps Define list of IPs allowed to access the Management UI. Supported in single IP, CIDR and range format. When undefined, Management UI is disabled.Must contain at least 1 item.
         * 
         * @return builder
         * 
         */
        public Builder managementAccessAllowedIps(String... managementAccessAllowedIps) {
            return managementAccessAllowedIps(List.of(managementAccessAllowedIps));
        }

        /**
         * @param netrisSoftgate Netris Softgate configuration properties. Follow [instructions](https://phoenixnap.com/kb/netris-bare-metal-cloud#deploy-netris-softgate) for retrieving the required details. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder netrisSoftgate(@Nullable Output<ServerNetrisSoftgateArgs> netrisSoftgate) {
            $.netrisSoftgate = netrisSoftgate;
            return this;
        }

        /**
         * @param netrisSoftgate Netris Softgate configuration properties. Follow [instructions](https://phoenixnap.com/kb/netris-bare-metal-cloud#deploy-netris-softgate) for retrieving the required details. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder netrisSoftgate(ServerNetrisSoftgateArgs netrisSoftgate) {
            return netrisSoftgate(Output.of(netrisSoftgate));
        }

        /**
         * @param networkConfiguration Entire network details of bare metal server. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkConfiguration(@Nullable Output<ServerNetworkConfigurationArgs> networkConfiguration) {
            $.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * @param networkConfiguration Entire network details of bare metal server. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkConfiguration(ServerNetworkConfigurationArgs networkConfiguration) {
            return networkConfiguration(Output.of(networkConfiguration));
        }

        /**
         * @param networkType The type of network configuration for this server. Currently this field should be set to PUBLIC_AND_PRIVATE, PRIVATE_ONLY, PUBLIC_ONLY or USER_DEFINED. Setting the force query parameter to `true` allows you to configure network configuration type as NONE.
         * 
         * @return builder
         * 
         */
        public Builder networkType(@Nullable Output<String> networkType) {
            $.networkType = networkType;
            return this;
        }

        /**
         * @param networkType The type of network configuration for this server. Currently this field should be set to PUBLIC_AND_PRIVATE, PRIVATE_ONLY, PUBLIC_ONLY or USER_DEFINED. Setting the force query parameter to `true` allows you to configure network configuration type as NONE.
         * 
         * @return builder
         * 
         */
        public Builder networkType(String networkType) {
            return networkType(Output.of(networkType));
        }

        /**
         * @param os The server’s OS ID used when the server was created (e.g., ubuntu/bionic, centos/centos7). For a full list of available operating systems visit [API docs](https://developers.phoenixnap.com/docs/bmc/1).
         * 
         * @return builder
         * 
         */
        public Builder os(Output<String> os) {
            $.os = os;
            return this;
        }

        /**
         * @param os The server’s OS ID used when the server was created (e.g., ubuntu/bionic, centos/centos7). For a full list of available operating systems visit [API docs](https://developers.phoenixnap.com/docs/bmc/1).
         * 
         * @return builder
         * 
         */
        public Builder os(String os) {
            return os(Output.of(os));
        }

        /**
         * @param pricingModel Server pricing model. Currently this field should be set to HOURLY, ONE_MONTH_RESERVATION, TWELVE_MONTHS_RESERVATION, TWENTY_FOUR_MONTHS_RESERVATION or THIRTY_SIX_MONTHS_RESERVATION.
         * 
         * @return builder
         * 
         */
        public Builder pricingModel(@Nullable Output<String> pricingModel) {
            $.pricingModel = pricingModel;
            return this;
        }

        /**
         * @param pricingModel Server pricing model. Currently this field should be set to HOURLY, ONE_MONTH_RESERVATION, TWELVE_MONTHS_RESERVATION, TWENTY_FOUR_MONTHS_RESERVATION or THIRTY_SIX_MONTHS_RESERVATION.
         * 
         * @return builder
         * 
         */
        public Builder pricingModel(String pricingModel) {
            return pricingModel(Output.of(pricingModel));
        }

        /**
         * @param rdpAllowedIps List of IPs allowed for RDP access to Windows OS. Supported in single IP, CIDR and range format. When undefined, RDP is disabled. To allow RDP access from any IP use 0.0.0.0/0. Must contain at least 1 item.
         * 
         * @return builder
         * 
         */
        public Builder rdpAllowedIps(@Nullable Output<List<String>> rdpAllowedIps) {
            $.rdpAllowedIps = rdpAllowedIps;
            return this;
        }

        /**
         * @param rdpAllowedIps List of IPs allowed for RDP access to Windows OS. Supported in single IP, CIDR and range format. When undefined, RDP is disabled. To allow RDP access from any IP use 0.0.0.0/0. Must contain at least 1 item.
         * 
         * @return builder
         * 
         */
        public Builder rdpAllowedIps(List<String> rdpAllowedIps) {
            return rdpAllowedIps(Output.of(rdpAllowedIps));
        }

        /**
         * @param rdpAllowedIps List of IPs allowed for RDP access to Windows OS. Supported in single IP, CIDR and range format. When undefined, RDP is disabled. To allow RDP access from any IP use 0.0.0.0/0. Must contain at least 1 item.
         * 
         * @return builder
         * 
         */
        public Builder rdpAllowedIps(String... rdpAllowedIps) {
            return rdpAllowedIps(List.of(rdpAllowedIps));
        }

        /**
         * @param reservationId Server reservation ID.
         * 
         * @return builder
         * 
         */
        public Builder reservationId(@Nullable Output<String> reservationId) {
            $.reservationId = reservationId;
            return this;
        }

        /**
         * @param reservationId Server reservation ID.
         * 
         * @return builder
         * 
         */
        public Builder reservationId(String reservationId) {
            return reservationId(Output.of(reservationId));
        }

        /**
         * @param sshKeyIds A list of SSH key IDs that will be installed on the server in addition to any SSH keys specified in this request.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyIds(@Nullable Output<List<String>> sshKeyIds) {
            $.sshKeyIds = sshKeyIds;
            return this;
        }

        /**
         * @param sshKeyIds A list of SSH key IDs that will be installed on the server in addition to any SSH keys specified in this request.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyIds(List<String> sshKeyIds) {
            return sshKeyIds(Output.of(sshKeyIds));
        }

        /**
         * @param sshKeyIds A list of SSH key IDs that will be installed on the server in addition to any SSH keys specified in this request.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyIds(String... sshKeyIds) {
            return sshKeyIds(List.of(sshKeyIds));
        }

        /**
         * @param sshKeys A list of SSH Keys that will be installed on the server.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(@Nullable Output<List<String>> sshKeys) {
            $.sshKeys = sshKeys;
            return this;
        }

        /**
         * @param sshKeys A list of SSH Keys that will be installed on the server.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(List<String> sshKeys) {
            return sshKeys(Output.of(sshKeys));
        }

        /**
         * @param sshKeys A list of SSH Keys that will be installed on the server.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(String... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }

        /**
         * @param storageConfiguration Storage configuration. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageConfiguration(@Nullable Output<ServerStorageConfigurationArgs> storageConfiguration) {
            $.storageConfiguration = storageConfiguration;
            return this;
        }

        /**
         * @param storageConfiguration Storage configuration. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageConfiguration(ServerStorageConfigurationArgs storageConfiguration) {
            return storageConfiguration(Output.of(storageConfiguration));
        }

        /**
         * @param tags Tags to set to server, if any. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ServerTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to set to server, if any. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ServerTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to set to server, if any. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder tags(ServerTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type Server type ID. Cannot be changed once a server is created (e.g., s1.c1.small, s1.c1.medium). For a full list of available types visit [API docs](https://developers.phoenixnap.com/docs/bmc/1).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Server type ID. Cannot be changed once a server is created (e.g., s1.c1.small, s1.c1.medium). For a full list of available types visit [API docs](https://developers.phoenixnap.com/docs/bmc/1).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServerArgs build() {
            if ($.hostname == null) {
                throw new MissingRequiredPropertyException("ServerArgs", "hostname");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("ServerArgs", "location");
            }
            if ($.os == null) {
                throw new MissingRequiredPropertyException("ServerArgs", "os");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ServerArgs", "type");
            }
            return $;
        }
    }

}