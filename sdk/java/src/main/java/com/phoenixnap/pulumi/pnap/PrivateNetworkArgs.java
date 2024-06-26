// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateNetworkArgs Empty = new PrivateNetworkArgs();

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
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of this private network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
     * 
     */
    public Output<String> location() {
        return this.location;
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

    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private PrivateNetworkArgs() {}

    private PrivateNetworkArgs(PrivateNetworkArgs $) {
        this.cidr = $.cidr;
        this.description = $.description;
        this.force = $.force;
        this.location = $.location;
        this.locationDefault = $.locationDefault;
        this.name = $.name;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateNetworkArgs $;

        public Builder() {
            $ = new PrivateNetworkArgs();
        }

        public Builder(PrivateNetworkArgs defaults) {
            $ = new PrivateNetworkArgs(Objects.requireNonNull(defaults));
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
        public Builder location(Output<String> location) {
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

        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public PrivateNetworkArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("PrivateNetworkArgs", "location");
            }
            return $;
        }
    }

}
