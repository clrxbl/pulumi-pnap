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
    public sealed class GetInvoicesPaginatedInvoiceResult
    {
        /// <summary>
        /// The limit of the number of results returned. The number of records returned may be smaller than the limit.
        /// </summary>
        public readonly int Limit;
        /// <summary>
        /// The number of items to skip in the results.
        /// </summary>
        public readonly int Offset;
        /// <summary>
        /// The list of invoices.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInvoicesPaginatedInvoiceResultResult> Results;
        public readonly int Total;

        [OutputConstructor]
        private GetInvoicesPaginatedInvoiceResult(
            int limit,

            int offset,

            ImmutableArray<Outputs.GetInvoicesPaginatedInvoiceResultResult> results,

            int total)
        {
            Limit = limit;
            Offset = offset;
            Results = results;
            Total = total;
        }
    }
}