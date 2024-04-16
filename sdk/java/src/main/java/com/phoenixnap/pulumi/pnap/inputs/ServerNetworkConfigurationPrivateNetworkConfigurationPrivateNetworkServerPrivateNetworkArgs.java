// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs Empty = new ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs();

    /**
     * Determines whether DHCP is enabled for this server. Should be false if ips is not an empty list. Not supported for proxmox OS. Default value is `false`.
     * 
     * The `ip_blocks_configuration` is the third field of the `network_configuration` block.
     * The `ip_blocks_configuration` block has 2 fields:
     * 
     */
    @Import(name="dhcp")
    private @Nullable Output<Boolean> dhcp;

    /**
     * @return Determines whether DHCP is enabled for this server. Should be false if ips is not an empty list. Not supported for proxmox OS. Default value is `false`.
     * 
     * The `ip_blocks_configuration` is the third field of the `network_configuration` block.
     * The `ip_blocks_configuration` block has 2 fields:
     * 
     */
    public Optional<Output<Boolean>> dhcp() {
        return Optional.ofNullable(this.dhcp);
    }

    /**
     * The network identifier.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The network identifier.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * IPs to configure on the server. IPs must be within the network&#39;s range. Must contain at least 1 item.
     * 
     * The `storage_configuration` block has field `root_partition`.
     * The `root_partition` block has two fields:
     * 
     */
    @Import(name="ips")
    private @Nullable Output<List<String>> ips;

    /**
     * @return IPs to configure on the server. IPs must be within the network&#39;s range. Must contain at least 1 item.
     * 
     * The `storage_configuration` block has field `root_partition`.
     * The `root_partition` block has two fields:
     * 
     */
    public Optional<Output<List<String>>> ips() {
        return Optional.ofNullable(this.ips);
    }

    @Import(name="statusDescription")
    private @Nullable Output<String> statusDescription;

    public Optional<Output<String>> statusDescription() {
        return Optional.ofNullable(this.statusDescription);
    }

    private ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs() {}

    private ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs(ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs $) {
        this.dhcp = $.dhcp;
        this.id = $.id;
        this.ips = $.ips;
        this.statusDescription = $.statusDescription;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs $;

        public Builder() {
            $ = new ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs();
        }

        public Builder(ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs defaults) {
            $ = new ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dhcp Determines whether DHCP is enabled for this server. Should be false if ips is not an empty list. Not supported for proxmox OS. Default value is `false`.
         * 
         * The `ip_blocks_configuration` is the third field of the `network_configuration` block.
         * The `ip_blocks_configuration` block has 2 fields:
         * 
         * @return builder
         * 
         */
        public Builder dhcp(@Nullable Output<Boolean> dhcp) {
            $.dhcp = dhcp;
            return this;
        }

        /**
         * @param dhcp Determines whether DHCP is enabled for this server. Should be false if ips is not an empty list. Not supported for proxmox OS. Default value is `false`.
         * 
         * The `ip_blocks_configuration` is the third field of the `network_configuration` block.
         * The `ip_blocks_configuration` block has 2 fields:
         * 
         * @return builder
         * 
         */
        public Builder dhcp(Boolean dhcp) {
            return dhcp(Output.of(dhcp));
        }

        /**
         * @param id The network identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The network identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ips IPs to configure on the server. IPs must be within the network&#39;s range. Must contain at least 1 item.
         * 
         * The `storage_configuration` block has field `root_partition`.
         * The `root_partition` block has two fields:
         * 
         * @return builder
         * 
         */
        public Builder ips(@Nullable Output<List<String>> ips) {
            $.ips = ips;
            return this;
        }

        /**
         * @param ips IPs to configure on the server. IPs must be within the network&#39;s range. Must contain at least 1 item.
         * 
         * The `storage_configuration` block has field `root_partition`.
         * The `root_partition` block has two fields:
         * 
         * @return builder
         * 
         */
        public Builder ips(List<String> ips) {
            return ips(Output.of(ips));
        }

        /**
         * @param ips IPs to configure on the server. IPs must be within the network&#39;s range. Must contain at least 1 item.
         * 
         * The `storage_configuration` block has field `root_partition`.
         * The `root_partition` block has two fields:
         * 
         * @return builder
         * 
         */
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }

        public Builder statusDescription(@Nullable Output<String> statusDescription) {
            $.statusDescription = statusDescription;
            return this;
        }

        public Builder statusDescription(String statusDescription) {
            return statusDescription(Output.of(statusDescription));
        }

        public ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkArgs", "id");
            }
            return $;
        }
    }

}
