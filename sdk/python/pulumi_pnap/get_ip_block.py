# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetIpBlockResult',
    'AwaitableGetIpBlockResult',
    'get_ip_block',
    'get_ip_block_output',
]

@pulumi.output_type
class GetIpBlockResult:
    """
    A collection of values returned by getIpBlock.
    """
    def __init__(__self__, assigned_resource_id=None, assigned_resource_type=None, cidr=None, cidr_block_size=None, created_on=None, description=None, id=None, is_bring_your_own=None, location=None, status=None, tags=None):
        if assigned_resource_id and not isinstance(assigned_resource_id, str):
            raise TypeError("Expected argument 'assigned_resource_id' to be a str")
        pulumi.set(__self__, "assigned_resource_id", assigned_resource_id)
        if assigned_resource_type and not isinstance(assigned_resource_type, str):
            raise TypeError("Expected argument 'assigned_resource_type' to be a str")
        pulumi.set(__self__, "assigned_resource_type", assigned_resource_type)
        if cidr and not isinstance(cidr, str):
            raise TypeError("Expected argument 'cidr' to be a str")
        pulumi.set(__self__, "cidr", cidr)
        if cidr_block_size and not isinstance(cidr_block_size, str):
            raise TypeError("Expected argument 'cidr_block_size' to be a str")
        pulumi.set(__self__, "cidr_block_size", cidr_block_size)
        if created_on and not isinstance(created_on, str):
            raise TypeError("Expected argument 'created_on' to be a str")
        pulumi.set(__self__, "created_on", created_on)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_bring_your_own and not isinstance(is_bring_your_own, bool):
            raise TypeError("Expected argument 'is_bring_your_own' to be a bool")
        pulumi.set(__self__, "is_bring_your_own", is_bring_your_own)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="assignedResourceId")
    def assigned_resource_id(self) -> str:
        """
        ID of the resource assigned to the IP Block.
        * `assigned_resource_type `- Type of the resource assigned to the IP Block.
        """
        return pulumi.get(self, "assigned_resource_id")

    @property
    @pulumi.getter(name="assignedResourceType")
    def assigned_resource_type(self) -> str:
        return pulumi.get(self, "assigned_resource_type")

    @property
    @pulumi.getter
    def cidr(self) -> str:
        """
        The IP Block in CIDR notation.
        """
        return pulumi.get(self, "cidr")

    @property
    @pulumi.getter(name="cidrBlockSize")
    def cidr_block_size(self) -> str:
        """
        CIDR IP Block Size.
        """
        return pulumi.get(self, "cidr_block_size")

    @property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> str:
        """
        Date and time when the IP Block was created.
        """
        return pulumi.get(self, "created_on")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the IP Block.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique id of the tag.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isBringYourOwn")
    def is_bring_your_own(self) -> bool:
        """
        True if the IP Block is a "bring your own" block.
        """
        return pulumi.get(self, "is_bring_your_own")

    @property
    @pulumi.getter
    def location(self) -> str:
        """
        IP Block location ID.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the IP Block.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetIpBlockTagResult']:
        """
        The tags assigned to the IP Block.
        """
        return pulumi.get(self, "tags")


class AwaitableGetIpBlockResult(GetIpBlockResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIpBlockResult(
            assigned_resource_id=self.assigned_resource_id,
            assigned_resource_type=self.assigned_resource_type,
            cidr=self.cidr,
            cidr_block_size=self.cidr_block_size,
            created_on=self.created_on,
            description=self.description,
            id=self.id,
            is_bring_your_own=self.is_bring_your_own,
            location=self.location,
            status=self.status,
            tags=self.tags)


def get_ip_block(cidr: Optional[str] = None,
                 id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIpBlockResult:
    """
    Provides a phoenixNAP IP Block datasource. This can be used to read IP Blocks.

    ## Example Usage

    Fetch an IP Block by CIDR and show it's details in alphabetical order

    ```python
    import pulumi
    import pulumi_pnap as pnap

    test = pnap.get_ip_block(cidr="1.1.1.0/31")
    pulumi.export("ip-block", test)
    ```


    :param str cidr: The IP Block in CIDR notation.
    :param str id: The IP Block identifier.
    """
    __args__ = dict()
    __args__['cidr'] = cidr
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pnap:index/getIpBlock:getIpBlock', __args__, opts=opts, typ=GetIpBlockResult).value

    return AwaitableGetIpBlockResult(
        assigned_resource_id=pulumi.get(__ret__, 'assigned_resource_id'),
        assigned_resource_type=pulumi.get(__ret__, 'assigned_resource_type'),
        cidr=pulumi.get(__ret__, 'cidr'),
        cidr_block_size=pulumi.get(__ret__, 'cidr_block_size'),
        created_on=pulumi.get(__ret__, 'created_on'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        is_bring_your_own=pulumi.get(__ret__, 'is_bring_your_own'),
        location=pulumi.get(__ret__, 'location'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_ip_block)
def get_ip_block_output(cidr: Optional[pulumi.Input[Optional[str]]] = None,
                        id: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIpBlockResult]:
    """
    Provides a phoenixNAP IP Block datasource. This can be used to read IP Blocks.

    ## Example Usage

    Fetch an IP Block by CIDR and show it's details in alphabetical order

    ```python
    import pulumi
    import pulumi_pnap as pnap

    test = pnap.get_ip_block(cidr="1.1.1.0/31")
    pulumi.export("ip-block", test)
    ```


    :param str cidr: The IP Block in CIDR notation.
    :param str id: The IP Block identifier.
    """
    ...
