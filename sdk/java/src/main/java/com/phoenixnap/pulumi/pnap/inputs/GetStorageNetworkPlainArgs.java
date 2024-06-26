// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStorageNetworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStorageNetworkPlainArgs Empty = new GetStorageNetworkPlainArgs();

    /**
     * The storage network identifier.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The storage network identifier.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The friendly name of this storage network.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The friendly name of this storage network.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetStorageNetworkPlainArgs() {}

    private GetStorageNetworkPlainArgs(GetStorageNetworkPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStorageNetworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStorageNetworkPlainArgs $;

        public Builder() {
            $ = new GetStorageNetworkPlainArgs();
        }

        public Builder(GetStorageNetworkPlainArgs defaults) {
            $ = new GetStorageNetworkPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The storage network identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The friendly name of this storage network.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetStorageNetworkPlainArgs build() {
            return $;
        }
    }

}
