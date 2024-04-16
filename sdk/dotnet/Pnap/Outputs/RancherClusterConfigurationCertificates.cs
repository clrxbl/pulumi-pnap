// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace PhoenixNAP.Pulumi.Pnap.Outputs
{

    [OutputType]
    public sealed class RancherClusterConfigurationCertificates
    {
        /// <summary>
        /// The SSL CA certificate to be used for rancher admin.
        /// </summary>
        public readonly string? CaCertificate;
        /// <summary>
        /// The SSL certificate to be used for rancher admin.
        /// </summary>
        public readonly string? Certificate;
        /// <summary>
        /// The SSL certificate key to be used for rancher admin.
        /// </summary>
        public readonly string? CertificateKey;

        [OutputConstructor]
        private RancherClusterConfigurationCertificates(
            string? caCertificate,

            string? certificate,

            string? certificateKey)
        {
            CaCertificate = caCertificate;
            Certificate = certificate;
            CertificateKey = certificateKey;
        }
    }
}