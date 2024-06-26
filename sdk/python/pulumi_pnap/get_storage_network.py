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
    'GetStorageNetworkResult',
    'AwaitableGetStorageNetworkResult',
    'get_storage_network',
    'get_storage_network_output',
]

@pulumi.output_type
class GetStorageNetworkResult:
    """
    A collection of values returned by getStorageNetwork.
    """
    def __init__(__self__, created_on=None, delete_requested_on=None, description=None, id=None, ips=None, location=None, name=None, network_id=None, status=None, volumes=None):
        if created_on and not isinstance(created_on, str):
            raise TypeError("Expected argument 'created_on' to be a str")
        pulumi.set(__self__, "created_on", created_on)
        if delete_requested_on and not isinstance(delete_requested_on, str):
            raise TypeError("Expected argument 'delete_requested_on' to be a str")
        pulumi.set(__self__, "delete_requested_on", delete_requested_on)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ips and not isinstance(ips, list):
            raise TypeError("Expected argument 'ips' to be a list")
        pulumi.set(__self__, "ips", ips)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network_id and not isinstance(network_id, str):
            raise TypeError("Expected argument 'network_id' to be a str")
        pulumi.set(__self__, "network_id", network_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if volumes and not isinstance(volumes, list):
            raise TypeError("Expected argument 'volumes' to be a list")
        pulumi.set(__self__, "volumes", volumes)

    @property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> str:
        """
        Date and time when this volume was created.
        """
        return pulumi.get(self, "created_on")

    @property
    @pulumi.getter(name="deleteRequestedOn")
    def delete_requested_on(self) -> str:
        """
        Date and time of the initial request for volume deletion.
        """
        return pulumi.get(self, "delete_requested_on")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Volume description.
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
    @pulumi.getter
    def ips(self) -> Sequence[str]:
        """
        IP of the storage network
        """
        return pulumi.get(self, "ips")

    @property
    @pulumi.getter
    def location(self) -> str:
        """
        The location of this storage network.
        * `network_id `- ID of network the storage belongs to.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the tag.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> str:
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Volume's status.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def volumes(self) -> Sequence['outputs.GetStorageNetworkVolumeResult']:
        """
        Volume for the storage network.
        """
        return pulumi.get(self, "volumes")


class AwaitableGetStorageNetworkResult(GetStorageNetworkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStorageNetworkResult(
            created_on=self.created_on,
            delete_requested_on=self.delete_requested_on,
            description=self.description,
            id=self.id,
            ips=self.ips,
            location=self.location,
            name=self.name,
            network_id=self.network_id,
            status=self.status,
            volumes=self.volumes)


def get_storage_network(id: Optional[str] = None,
                        name: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStorageNetworkResult:
    """
    Provides a phoenixNAP Storage Network datasource. This can be used to read storage networks.

    ## Example Usage

    Fetch a storage network by name and show it's volumes

    ```python
    import pulumi
    import pulumi_pnap as pnap

    storage__network_1 = pnap.get_storage_network(name="Storage-1")
    pulumi.export("volumes", storage__network_1.volumes)
    ```


    :param str id: The storage network identifier.
    :param str name: The friendly name of this storage network.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pnap:index/getStorageNetwork:getStorageNetwork', __args__, opts=opts, typ=GetStorageNetworkResult).value

    return AwaitableGetStorageNetworkResult(
        created_on=pulumi.get(__ret__, 'created_on'),
        delete_requested_on=pulumi.get(__ret__, 'delete_requested_on'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        ips=pulumi.get(__ret__, 'ips'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        network_id=pulumi.get(__ret__, 'network_id'),
        status=pulumi.get(__ret__, 'status'),
        volumes=pulumi.get(__ret__, 'volumes'))


@_utilities.lift_output_func(get_storage_network)
def get_storage_network_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                               name: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStorageNetworkResult]:
    """
    Provides a phoenixNAP Storage Network datasource. This can be used to read storage networks.

    ## Example Usage

    Fetch a storage network by name and show it's volumes

    ```python
    import pulumi
    import pulumi_pnap as pnap

    storage__network_1 = pnap.get_storage_network(name="Storage-1")
    pulumi.export("volumes", storage__network_1.volumes)
    ```


    :param str id: The storage network identifier.
    :param str name: The friendly name of this storage network.
    """
    ...
