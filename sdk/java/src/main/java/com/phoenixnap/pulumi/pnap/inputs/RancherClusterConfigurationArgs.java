// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.phoenixnap.pulumi.pnap.inputs.RancherClusterConfigurationCertificatesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RancherClusterConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RancherClusterConfigurationArgs Empty = new RancherClusterConfigurationArgs();

    /**
     * Define the custom SSL certificates to be used instead of defaults. The `certificates` block has 3 fields.
     * 
     */
    @Import(name="certificates")
    private @Nullable Output<RancherClusterConfigurationCertificatesArgs> certificates;

    /**
     * @return Define the custom SSL certificates to be used instead of defaults. The `certificates` block has 3 fields.
     * 
     */
    public Optional<Output<RancherClusterConfigurationCertificatesArgs>> certificates() {
        return Optional.ofNullable(this.certificates);
    }

    /**
     * This maps to rancher&#39;s cluster-domain. Cluster Domain.
     * 
     */
    @Import(name="clusterDomain")
    private @Nullable Output<String> clusterDomain;

    /**
     * @return This maps to rancher&#39;s cluster-domain. Cluster Domain.
     * 
     */
    public Optional<Output<String>> clusterDomain() {
        return Optional.ofNullable(this.clusterDomain);
    }

    /**
     * This maps to rancher&#39;s etcd-snapshot-retention. Number of snapshots to retain. Default value is 5.
     * 
     */
    @Import(name="etcdSnapshotRetention")
    private @Nullable Output<Integer> etcdSnapshotRetention;

    /**
     * @return This maps to rancher&#39;s etcd-snapshot-retention. Number of snapshots to retain. Default value is 5.
     * 
     */
    public Optional<Output<Integer>> etcdSnapshotRetention() {
        return Optional.ofNullable(this.etcdSnapshotRetention);
    }

    /**
     * This maps to rancher&#39;s etcd-snapshot-schedule-cron. Snapshot interval time in cron spec.
     * 
     */
    @Import(name="etcdSnapshotScheduleCron")
    private @Nullable Output<String> etcdSnapshotScheduleCron;

    /**
     * @return This maps to rancher&#39;s etcd-snapshot-schedule-cron. Snapshot interval time in cron spec.
     * 
     */
    public Optional<Output<String>> etcdSnapshotScheduleCron() {
        return Optional.ofNullable(this.etcdSnapshotScheduleCron);
    }

    /**
     * This maps to rancher&#39;s node-taint. Registering kubelet with set of taints.
     * 
     */
    @Import(name="nodeTaint")
    private @Nullable Output<String> nodeTaint;

    /**
     * @return This maps to rancher&#39;s node-taint. Registering kubelet with set of taints.
     * 
     */
    public Optional<Output<String>> nodeTaint() {
        return Optional.ofNullable(this.nodeTaint);
    }

    /**
     * This maps to rancher&#39;s tls-san. Add additional hostname or IP as a Subject Alternative Name in the TLS cert.
     * 
     */
    @Import(name="tlsSan")
    private @Nullable Output<String> tlsSan;

    /**
     * @return This maps to rancher&#39;s tls-san. Add additional hostname or IP as a Subject Alternative Name in the TLS cert.
     * 
     */
    public Optional<Output<String>> tlsSan() {
        return Optional.ofNullable(this.tlsSan);
    }

    /**
     * Shared secret used to join a server or agent to a cluster.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return Shared secret used to join a server or agent to a cluster.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private RancherClusterConfigurationArgs() {}

    private RancherClusterConfigurationArgs(RancherClusterConfigurationArgs $) {
        this.certificates = $.certificates;
        this.clusterDomain = $.clusterDomain;
        this.etcdSnapshotRetention = $.etcdSnapshotRetention;
        this.etcdSnapshotScheduleCron = $.etcdSnapshotScheduleCron;
        this.nodeTaint = $.nodeTaint;
        this.tlsSan = $.tlsSan;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RancherClusterConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RancherClusterConfigurationArgs $;

        public Builder() {
            $ = new RancherClusterConfigurationArgs();
        }

        public Builder(RancherClusterConfigurationArgs defaults) {
            $ = new RancherClusterConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificates Define the custom SSL certificates to be used instead of defaults. The `certificates` block has 3 fields.
         * 
         * @return builder
         * 
         */
        public Builder certificates(@Nullable Output<RancherClusterConfigurationCertificatesArgs> certificates) {
            $.certificates = certificates;
            return this;
        }

        /**
         * @param certificates Define the custom SSL certificates to be used instead of defaults. The `certificates` block has 3 fields.
         * 
         * @return builder
         * 
         */
        public Builder certificates(RancherClusterConfigurationCertificatesArgs certificates) {
            return certificates(Output.of(certificates));
        }

        /**
         * @param clusterDomain This maps to rancher&#39;s cluster-domain. Cluster Domain.
         * 
         * @return builder
         * 
         */
        public Builder clusterDomain(@Nullable Output<String> clusterDomain) {
            $.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * @param clusterDomain This maps to rancher&#39;s cluster-domain. Cluster Domain.
         * 
         * @return builder
         * 
         */
        public Builder clusterDomain(String clusterDomain) {
            return clusterDomain(Output.of(clusterDomain));
        }

        /**
         * @param etcdSnapshotRetention This maps to rancher&#39;s etcd-snapshot-retention. Number of snapshots to retain. Default value is 5.
         * 
         * @return builder
         * 
         */
        public Builder etcdSnapshotRetention(@Nullable Output<Integer> etcdSnapshotRetention) {
            $.etcdSnapshotRetention = etcdSnapshotRetention;
            return this;
        }

        /**
         * @param etcdSnapshotRetention This maps to rancher&#39;s etcd-snapshot-retention. Number of snapshots to retain. Default value is 5.
         * 
         * @return builder
         * 
         */
        public Builder etcdSnapshotRetention(Integer etcdSnapshotRetention) {
            return etcdSnapshotRetention(Output.of(etcdSnapshotRetention));
        }

        /**
         * @param etcdSnapshotScheduleCron This maps to rancher&#39;s etcd-snapshot-schedule-cron. Snapshot interval time in cron spec.
         * 
         * @return builder
         * 
         */
        public Builder etcdSnapshotScheduleCron(@Nullable Output<String> etcdSnapshotScheduleCron) {
            $.etcdSnapshotScheduleCron = etcdSnapshotScheduleCron;
            return this;
        }

        /**
         * @param etcdSnapshotScheduleCron This maps to rancher&#39;s etcd-snapshot-schedule-cron. Snapshot interval time in cron spec.
         * 
         * @return builder
         * 
         */
        public Builder etcdSnapshotScheduleCron(String etcdSnapshotScheduleCron) {
            return etcdSnapshotScheduleCron(Output.of(etcdSnapshotScheduleCron));
        }

        /**
         * @param nodeTaint This maps to rancher&#39;s node-taint. Registering kubelet with set of taints.
         * 
         * @return builder
         * 
         */
        public Builder nodeTaint(@Nullable Output<String> nodeTaint) {
            $.nodeTaint = nodeTaint;
            return this;
        }

        /**
         * @param nodeTaint This maps to rancher&#39;s node-taint. Registering kubelet with set of taints.
         * 
         * @return builder
         * 
         */
        public Builder nodeTaint(String nodeTaint) {
            return nodeTaint(Output.of(nodeTaint));
        }

        /**
         * @param tlsSan This maps to rancher&#39;s tls-san. Add additional hostname or IP as a Subject Alternative Name in the TLS cert.
         * 
         * @return builder
         * 
         */
        public Builder tlsSan(@Nullable Output<String> tlsSan) {
            $.tlsSan = tlsSan;
            return this;
        }

        /**
         * @param tlsSan This maps to rancher&#39;s tls-san. Add additional hostname or IP as a Subject Alternative Name in the TLS cert.
         * 
         * @return builder
         * 
         */
        public Builder tlsSan(String tlsSan) {
            return tlsSan(Output.of(tlsSan));
        }

        /**
         * @param token Shared secret used to join a server or agent to a cluster.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Shared secret used to join a server or agent to a cluster.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public RancherClusterConfigurationArgs build() {
            return $;
        }
    }

}
