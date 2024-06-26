// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.phoenixnap.pulumi.pnap.inputs.PublicNetworkIpBlockArgs;
import com.phoenixnap.pulumi.pnap.inputs.PublicNetworkMembershipArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublicNetworkState extends com.pulumi.resources.ResourceArgs {

    public static final PublicNetworkState Empty = new PublicNetworkState();

    /**
     * Date and time when this public network was created.
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return Date and time when this public network was created.
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * The description of this public network.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this public network.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of IP Blocks that will be associated with this public network (10 items at most).
     * 
     */
    @Import(name="ipBlocks")
    private @Nullable Output<List<PublicNetworkIpBlockArgs>> ipBlocks;

    /**
     * @return A list of IP Blocks that will be associated with this public network (10 items at most).
     * 
     */
    public Optional<Output<List<PublicNetworkIpBlockArgs>>> ipBlocks() {
        return Optional.ofNullable(this.ipBlocks);
    }

    /**
     * The location of this public network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
     * * ` vlan_id  `- The VLAN that will be assigned to this network.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of this public network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
     * * ` vlan_id  `- The VLAN that will be assigned to this network.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A list of resources that are members of this public network.
     * 
     */
    @Import(name="memberships")
    private @Nullable Output<List<PublicNetworkMembershipArgs>> memberships;

    /**
     * @return A list of resources that are members of this public network.
     * 
     */
    public Optional<Output<List<PublicNetworkMembershipArgs>>> memberships() {
        return Optional.ofNullable(this.memberships);
    }

    /**
     * The friendly name of this public network. This name should be unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The friendly name of this public network. This name should be unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The status of the public network.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the public network.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private PublicNetworkState() {}

    private PublicNetworkState(PublicNetworkState $) {
        this.createdOn = $.createdOn;
        this.description = $.description;
        this.ipBlocks = $.ipBlocks;
        this.location = $.location;
        this.memberships = $.memberships;
        this.name = $.name;
        this.status = $.status;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicNetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicNetworkState $;

        public Builder() {
            $ = new PublicNetworkState();
        }

        public Builder(PublicNetworkState defaults) {
            $ = new PublicNetworkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdOn Date and time when this public network was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn Date and time when this public network was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param description The description of this public network.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this public network.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ipBlocks A list of IP Blocks that will be associated with this public network (10 items at most).
         * 
         * @return builder
         * 
         */
        public Builder ipBlocks(@Nullable Output<List<PublicNetworkIpBlockArgs>> ipBlocks) {
            $.ipBlocks = ipBlocks;
            return this;
        }

        /**
         * @param ipBlocks A list of IP Blocks that will be associated with this public network (10 items at most).
         * 
         * @return builder
         * 
         */
        public Builder ipBlocks(List<PublicNetworkIpBlockArgs> ipBlocks) {
            return ipBlocks(Output.of(ipBlocks));
        }

        /**
         * @param ipBlocks A list of IP Blocks that will be associated with this public network (10 items at most).
         * 
         * @return builder
         * 
         */
        public Builder ipBlocks(PublicNetworkIpBlockArgs... ipBlocks) {
            return ipBlocks(List.of(ipBlocks));
        }

        /**
         * @param location The location of this public network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
         * * ` vlan_id  `- The VLAN that will be assigned to this network.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of this public network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
         * * ` vlan_id  `- The VLAN that will be assigned to this network.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param memberships A list of resources that are members of this public network.
         * 
         * @return builder
         * 
         */
        public Builder memberships(@Nullable Output<List<PublicNetworkMembershipArgs>> memberships) {
            $.memberships = memberships;
            return this;
        }

        /**
         * @param memberships A list of resources that are members of this public network.
         * 
         * @return builder
         * 
         */
        public Builder memberships(List<PublicNetworkMembershipArgs> memberships) {
            return memberships(Output.of(memberships));
        }

        /**
         * @param memberships A list of resources that are members of this public network.
         * 
         * @return builder
         * 
         */
        public Builder memberships(PublicNetworkMembershipArgs... memberships) {
            return memberships(List.of(memberships));
        }

        /**
         * @param name The friendly name of this public network. This name should be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The friendly name of this public network. This name should be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param status The status of the public network.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the public network.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public PublicNetworkState build() {
            return $;
        }
    }

}
