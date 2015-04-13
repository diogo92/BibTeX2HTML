<#list InproceedingsList as InproceedingsData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${InproceedingsData.citationKey}</li>
			<li><strong>Author:</strong> ${InproceedingsData.author}</li>
			<li><strong>Title:</strong> ${InproceedingsData.title}</li>
			<li><strong>Book Title:</strong> ${InproceedingsData.booktitle}</li>
			<li><strong>Year:</strong> ${InproceedingsData.year}</li>
			<#if InproceedingsData.editor??>
				<li><strong>Editor:</strong> ${InproceedingsData.editor}</li>
			</#if>
			<#if InproceedingsData.volume??>
				<li><strong>Volume:</strong> ${InproceedingsData.volume}</li>
			</#if>
			<#if InproceedingsData.series??>
				<li><strong>Series:</strong> ${InproceedingsData.series}</li>
			</#if>
			<#if InproceedingsData.pages??>
				<li><strong>Pages:</strong> ${InproceedingsData.pages}</li>
			</#if>
			<#if InproceedingsData.address??>
				<li><strong>Address:</strong> ${InproceedingsData.address}</li>
			</#if>
			<#if InproceedingsData.month??>
				<li><strong>Month:</strong> ${InproceedingsData.month}</li>
			</#if>
			<#if InproceedingsData.organization??>
				<li><strong>Organization:</strong> ${InproceedingsData.organization}</li>
			</#if>
			<#if InproceedingsData.publisher??>
				<li><strong>Publisher:</strong> ${InproceedingsData.publisher}</li>
			</#if>
			<#if InproceedingsData.note??>
				<li><strong>Note:</strong> ${InproceedingsData.note}</li>
			</#if>
			<#if InproceedingsData.key??>
				<li><strong>Key:</strong> ${InproceedingsData.key}</li>
			</#if>
		</ul>
	</div>
</#list>