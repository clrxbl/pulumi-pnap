// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRancherClusterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRancherClusterPlainArgs Empty = new GetRancherClusterPlainArgs();

    /**
     * The cluster (Rancher Cluster) identifier.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The cluster (Rancher Cluster) identifier.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Cluster name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Cluster name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetRancherClusterPlainArgs() {}

    private GetRancherClusterPlainArgs(GetRancherClusterPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRancherClusterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRancherClusterPlainArgs $;

        public Builder() {
            $ = new GetRancherClusterPlainArgs();
        }

        public Builder(GetRancherClusterPlainArgs defaults) {
            $ = new GetRancherClusterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The cluster (Rancher Cluster) identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetRancherClusterPlainArgs build() {
            return $;
        }
    }

}