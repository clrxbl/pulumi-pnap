// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.phoenixnap.pulumi.pnap.inputs.StorageNetworkVolumeVolumePermissionArgs;
import com.phoenixnap.pulumi.pnap.inputs.StorageNetworkVolumeVolumeTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageNetworkVolumeVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageNetworkVolumeVolumeArgs Empty = new StorageNetworkVolumeVolumeArgs();

    /**
     * Capacity of volume in GB. Currently only whole numbers and multiples of 1000 GB are supported.
     * 
     */
    @Import(name="capacityInGb", required=true)
    private Output<Integer> capacityInGb;

    /**
     * @return Capacity of volume in GB. Currently only whole numbers and multiples of 1000 GB are supported.
     * 
     */
    public Output<Integer> capacityInGb() {
        return this.capacityInGb;
    }

    /**
     * Date and time when this volume was created.
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return Date and time when this volume was created.
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * Date and time of the initial request for volume deletion.
     * 
     */
    @Import(name="deleteRequestedOn")
    private @Nullable Output<String> deleteRequestedOn;

    /**
     * @return Date and time of the initial request for volume deletion.
     * 
     */
    public Optional<Output<String>> deleteRequestedOn() {
        return Optional.ofNullable(this.deleteRequestedOn);
    }

    /**
     * Volume description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Volume description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The unique id of the tag.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The unique id of the tag.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the tag.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the tag.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Volume&#39;s full path. It is in form of `/{volumeId}/pathSuffix`.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Volume&#39;s full path. It is in form of `/{volumeId}/pathSuffix`.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Last part of volume&#39;s path.
     * 
     */
    @Import(name="pathSuffix")
    private @Nullable Output<String> pathSuffix;

    /**
     * @return Last part of volume&#39;s path.
     * 
     */
    public Optional<Output<String>> pathSuffix() {
        return Optional.ofNullable(this.pathSuffix);
    }

    /**
     * Permissions for the volume.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<StorageNetworkVolumeVolumePermissionArgs>> permissions;

    /**
     * @return Permissions for the volume.
     * 
     */
    public Optional<Output<List<StorageNetworkVolumeVolumePermissionArgs>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * File system protocol.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return File system protocol.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Volume&#39;s status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Volume&#39;s status.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Tags to set to the volume.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<StorageNetworkVolumeVolumeTagArgs>> tags;

    /**
     * @return Tags to set to the volume.
     * 
     */
    public Optional<Output<List<StorageNetworkVolumeVolumeTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Used capacity in GB, updated periodically.
     * 
     */
    @Import(name="usedCapacityInGb")
    private @Nullable Output<Integer> usedCapacityInGb;

    /**
     * @return Used capacity in GB, updated periodically.
     * 
     */
    public Optional<Output<Integer>> usedCapacityInGb() {
        return Optional.ofNullable(this.usedCapacityInGb);
    }

    private StorageNetworkVolumeVolumeArgs() {}

    private StorageNetworkVolumeVolumeArgs(StorageNetworkVolumeVolumeArgs $) {
        this.capacityInGb = $.capacityInGb;
        this.createdOn = $.createdOn;
        this.deleteRequestedOn = $.deleteRequestedOn;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.path = $.path;
        this.pathSuffix = $.pathSuffix;
        this.permissions = $.permissions;
        this.protocol = $.protocol;
        this.status = $.status;
        this.tags = $.tags;
        this.usedCapacityInGb = $.usedCapacityInGb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageNetworkVolumeVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageNetworkVolumeVolumeArgs $;

        public Builder() {
            $ = new StorageNetworkVolumeVolumeArgs();
        }

        public Builder(StorageNetworkVolumeVolumeArgs defaults) {
            $ = new StorageNetworkVolumeVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacityInGb Capacity of volume in GB. Currently only whole numbers and multiples of 1000 GB are supported.
         * 
         * @return builder
         * 
         */
        public Builder capacityInGb(Output<Integer> capacityInGb) {
            $.capacityInGb = capacityInGb;
            return this;
        }

        /**
         * @param capacityInGb Capacity of volume in GB. Currently only whole numbers and multiples of 1000 GB are supported.
         * 
         * @return builder
         * 
         */
        public Builder capacityInGb(Integer capacityInGb) {
            return capacityInGb(Output.of(capacityInGb));
        }

        /**
         * @param createdOn Date and time when this volume was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn Date and time when this volume was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param deleteRequestedOn Date and time of the initial request for volume deletion.
         * 
         * @return builder
         * 
         */
        public Builder deleteRequestedOn(@Nullable Output<String> deleteRequestedOn) {
            $.deleteRequestedOn = deleteRequestedOn;
            return this;
        }

        /**
         * @param deleteRequestedOn Date and time of the initial request for volume deletion.
         * 
         * @return builder
         * 
         */
        public Builder deleteRequestedOn(String deleteRequestedOn) {
            return deleteRequestedOn(Output.of(deleteRequestedOn));
        }

        /**
         * @param description Volume description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Volume description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param id The unique id of the tag.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique id of the tag.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the tag.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the tag.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Volume&#39;s full path. It is in form of `/{volumeId}/pathSuffix`.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Volume&#39;s full path. It is in form of `/{volumeId}/pathSuffix`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param pathSuffix Last part of volume&#39;s path.
         * 
         * @return builder
         * 
         */
        public Builder pathSuffix(@Nullable Output<String> pathSuffix) {
            $.pathSuffix = pathSuffix;
            return this;
        }

        /**
         * @param pathSuffix Last part of volume&#39;s path.
         * 
         * @return builder
         * 
         */
        public Builder pathSuffix(String pathSuffix) {
            return pathSuffix(Output.of(pathSuffix));
        }

        /**
         * @param permissions Permissions for the volume.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<List<StorageNetworkVolumeVolumePermissionArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Permissions for the volume.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<StorageNetworkVolumeVolumePermissionArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions Permissions for the volume.
         * 
         * @return builder
         * 
         */
        public Builder permissions(StorageNetworkVolumeVolumePermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }

        /**
         * @param protocol File system protocol.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol File system protocol.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param status Volume&#39;s status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Volume&#39;s status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags Tags to set to the volume.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<StorageNetworkVolumeVolumeTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to set to the volume.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<StorageNetworkVolumeVolumeTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to set to the volume.
         * 
         * @return builder
         * 
         */
        public Builder tags(StorageNetworkVolumeVolumeTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param usedCapacityInGb Used capacity in GB, updated periodically.
         * 
         * @return builder
         * 
         */
        public Builder usedCapacityInGb(@Nullable Output<Integer> usedCapacityInGb) {
            $.usedCapacityInGb = usedCapacityInGb;
            return this;
        }

        /**
         * @param usedCapacityInGb Used capacity in GB, updated periodically.
         * 
         * @return builder
         * 
         */
        public Builder usedCapacityInGb(Integer usedCapacityInGb) {
            return usedCapacityInGb(Output.of(usedCapacityInGb));
        }

        public StorageNetworkVolumeVolumeArgs build() {
            if ($.capacityInGb == null) {
                throw new MissingRequiredPropertyException("StorageNetworkVolumeVolumeArgs", "capacityInGb");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("StorageNetworkVolumeVolumeArgs", "name");
            }
            return $;
        }
    }

}
