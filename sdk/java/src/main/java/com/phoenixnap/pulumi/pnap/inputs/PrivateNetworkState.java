// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.phoenixnap.pulumi.pnap.inputs.PrivateNetworkMembershipArgs;
import com.phoenixnap.pulumi.pnap.inputs.PrivateNetworkServerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateNetworkState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateNetworkState Empty = new PrivateNetworkState();

    /**
     * IP range associated with this private network in CIDR notation. Setting the `force` query parameter to `true` allows you to skip assigning a specific IP range to network.
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return IP range associated with this private network in CIDR notation. Setting the `force` query parameter to `true` allows you to skip assigning a specific IP range to network.
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * Date and time when this private network was created.
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return Date and time when this private network was created.
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * The description of this private network.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this private network.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Query parameter controlling advanced features availability. It is advised to use with caution since it might lead to unhealthy setups.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return Query parameter controlling advanced features availability. It is advised to use with caution since it might lead to unhealthy setups.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The location of this private network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of this private network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Identifies network as the default private network for the specified location. Default value is `false`.
     * * ` vlan_id  `- The VLAN that will be assigned to this network.
     * 
     */
    @Import(name="locationDefault")
    private @Nullable Output<Boolean> locationDefault;

    /**
     * @return Identifies network as the default private network for the specified location. Default value is `false`.
     * * ` vlan_id  `- The VLAN that will be assigned to this network.
     * 
     */
    public Optional<Output<Boolean>> locationDefault() {
        return Optional.ofNullable(this.locationDefault);
    }

    /**
     * A list of resources that are members of this private network.
     * 
     */
    @Import(name="memberships")
    private @Nullable Output<List<PrivateNetworkMembershipArgs>> memberships;

    /**
     * @return A list of resources that are members of this private network.
     * 
     */
    public Optional<Output<List<PrivateNetworkMembershipArgs>>> memberships() {
        return Optional.ofNullable(this.memberships);
    }

    /**
     * The friendly name of this private network. This name should be unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The friendly name of this private network. This name should be unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="servers")
    private @Nullable Output<List<PrivateNetworkServerArgs>> servers;

    public Optional<Output<List<PrivateNetworkServerArgs>>> servers() {
        return Optional.ofNullable(this.servers);
    }

    /**
     * The status of the private network.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the private network.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The type of the private network.
     * * ` servers  ` - (Deprecated) List of server details linked to the private network.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the private network.
     * * ` servers  ` - (Deprecated) List of server details linked to the private network.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private PrivateNetworkState() {}

    private PrivateNetworkState(PrivateNetworkState $) {
        this.cidr = $.cidr;
        this.createdOn = $.createdOn;
        this.description = $.description;
        this.force = $.force;
        this.location = $.location;
        this.locationDefault = $.locationDefault;
        this.memberships = $.memberships;
        this.name = $.name;
        this.servers = $.servers;
        this.status = $.status;
        this.type = $.type;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateNetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateNetworkState $;

        public Builder() {
            $ = new PrivateNetworkState();
        }

        public Builder(PrivateNetworkState defaults) {
            $ = new PrivateNetworkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr IP range associated with this private network in CIDR notation. Setting the `force` query parameter to `true` allows you to skip assigning a specific IP range to network.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr IP range associated with this private network in CIDR notation. Setting the `force` query parameter to `true` allows you to skip assigning a specific IP range to network.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param createdOn Date and time when this private network was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn Date and time when this private network was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param description The description of this private network.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this private network.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param force Query parameter controlling advanced features availability. It is advised to use with caution since it might lead to unhealthy setups.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force Query parameter controlling advanced features availability. It is advised to use with caution since it might lead to unhealthy setups.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param location The location of this private network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of this private network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param locationDefault Identifies network as the default private network for the specified location. Default value is `false`.
         * * ` vlan_id  `- The VLAN that will be assigned to this network.
         * 
         * @return builder
         * 
         */
        public Builder locationDefault(@Nullable Output<Boolean> locationDefault) {
            $.locationDefault = locationDefault;
            return this;
        }

        /**
         * @param locationDefault Identifies network as the default private network for the specified location. Default value is `false`.
         * * ` vlan_id  `- The VLAN that will be assigned to this network.
         * 
         * @return builder
         * 
         */
        public Builder locationDefault(Boolean locationDefault) {
            return locationDefault(Output.of(locationDefault));
        }

        /**
         * @param memberships A list of resources that are members of this private network.
         * 
         * @return builder
         * 
         */
        public Builder memberships(@Nullable Output<List<PrivateNetworkMembershipArgs>> memberships) {
            $.memberships = memberships;
            return this;
        }

        /**
         * @param memberships A list of resources that are members of this private network.
         * 
         * @return builder
         * 
         */
        public Builder memberships(List<PrivateNetworkMembershipArgs> memberships) {
            return memberships(Output.of(memberships));
        }

        /**
         * @param memberships A list of resources that are members of this private network.
         * 
         * @return builder
         * 
         */
        public Builder memberships(PrivateNetworkMembershipArgs... memberships) {
            return memberships(List.of(memberships));
        }

        /**
         * @param name The friendly name of this private network. This name should be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The friendly name of this private network. This name should be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder servers(@Nullable Output<List<PrivateNetworkServerArgs>> servers) {
            $.servers = servers;
            return this;
        }

        public Builder servers(List<PrivateNetworkServerArgs> servers) {
            return servers(Output.of(servers));
        }

        public Builder servers(PrivateNetworkServerArgs... servers) {
            return servers(List.of(servers));
        }

        /**
         * @param status The status of the private network.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the private network.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type The type of the private network.
         * * ` servers  ` - (Deprecated) List of server details linked to the private network.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the private network.
         * * ` servers  ` - (Deprecated) List of server details linked to the private network.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public PrivateNetworkState build() {
            return $;
        }
    }

}